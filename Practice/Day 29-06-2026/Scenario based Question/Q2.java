/*
2. A company wants different login roles like Admin, Student, 
and Trainer. How would you design it?

This is an OOP Inheritance + Polymorphism interview question.

Answer

Use Inheritance to represent common login functionality and Method Overriding (Polymorphism)
 for role-specific behavior.

Create a parent class User with a common login() method.
Create child classes Admin, Student, and Trainer.
Each child class overrides the login() method according to its role.

*/
class User {
    void login() {
        System.out.println("User Login");
    }
}

class Admin extends User {
    @Override
    void login() {
        System.out.println("Admin Login");
    }
}

class Student extends User {
    @Override
    void login() {
        System.out.println("Student Login");
    }
}

class Trainer extends User {
    @Override
    void login() {
        System.out.println("Trainer Login");
    }
}

public class Q2 {
    public static void main(String[] args) {
        User user;

        user = new Admin();
        user.login();

        user = new Student();
        user.login();

        user = new Trainer();
        user.login();
    }
}

/*
Inheritance avoids writing common login code multiple times.
Method Overriding allows each role to have its own login behavior.
New roles (e.g., Guest, Manager) can be added easily without changing existing co
*/