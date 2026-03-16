import java.util.*;

class Vehicle {
    private String brand;
    private int speed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void speed() {
        System.out.println("Vehicle speed is good");
    }
}

class Car extends Vehicle {
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Brand: " + getBrand());
    }
}

public class Q2 {
    public static void main(String args[]) {

        Car c = new Car();

        c.setBrand("Toyota");
        c.setModel("Fortuner");

        c.display();   // child class method
        c.speed();     // parent class method
    }
}