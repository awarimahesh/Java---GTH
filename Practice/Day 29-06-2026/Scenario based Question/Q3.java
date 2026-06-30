/*
. A cab booking app has Mini, Sedan, and SUV rides with different pricing.
 How would you model this system?


This is an OOP Polymorphism (Method Overriding) interview question.

Answer

Use Inheritance and Runtime Polymorphism.

Create a parent class Cab.
Define a method calculateFare().
Create child classes Mini, Sedan, and SUV.
Each child class overrides calculateFare() with its own pricing logic.



*/
class Cab {
    double calculateFare(double distance) {
        return 0;
    }
}

class Mini extends Cab {
    @Override
    double calculateFare(double distance) {
        return distance * 10;
    }
}

class Sedan extends Cab {
    @Override
    double calculateFare(double distance) {
        return distance * 15;
    }
}

class SUV extends Cab {
    @Override
    double calculateFare(double distance) {
        return distance * 20;
    }
}

 public class Q3 {
    public static void main(String[] args) {
        Cab cab;

        cab = new Mini();
        System.out.println("Mini Fare = ₹" + cab.calculateFare(10));

        cab = new Sedan();
        System.out.println("Sedan Fare = ₹" + cab.calculateFare(10));

        cab = new SUV();
        System.out.println("SUV Fare = ₹" + cab.calculateFare(10));
    }
}


/*
Inheritance: Mini, Sedan, and SUV are all types of Cab.
Method Overriding: Each ride type calculates the fare differently.
Runtime Polymorphism: The correct calculateFare() method is selected at runtime
 based on the actual cab object.
*/