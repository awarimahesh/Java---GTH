/*

1. In a food delivery app, different restaurants calculate delivery charges differently.
 How would you implement this?
 
 
 
 This is an OOP Polymorphism interview question.

Answer

Use method overriding (Runtime Polymorphism).

Create a common parent class or interface Restaurant.
Define a method calculateDeliveryCharge().
Each restaurant overrides this method with its own delivery charge logic.
At runtime, the correct method is called based on the restaurant object.
*/

abstract class Restaurant {
    abstract double calculateDeliveryCharge(double distance);
}

class PizzaHut extends Restaurant {
    @Override
    double calculateDeliveryCharge(double distance) {
        return distance * 10;
    }
}

class Dominos extends Restaurant {
    @Override
    double calculateDeliveryCharge(double distance) {
        return distance * 8;
    }
}

class KFC extends Restaurant {
    @Override
    double calculateDeliveryCharge(double distance) {
        return distance * 12;
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Restaurant r;

        r = new PizzaHut();
        System.out.println("PizzaHut Charge = " + r.calculateDeliveryCharge(5));

        r = new Dominos();
        System.out.println("Dominos Charge = " + r.calculateDeliveryCharge(5));

        r = new KFC();
        System.out.println("KFC Charge = " + r.calculateDeliveryCharge(5));
    }
}

