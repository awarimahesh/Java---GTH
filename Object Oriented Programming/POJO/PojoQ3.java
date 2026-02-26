
/*
Q3. Problem:
Create a POJO class Car with fields: carId, model, fuelConsumed, and distanceTravelled. Store details of 5 cars using an array of objects. Perform the following operations:
Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).
Find the car with the best mileage.
Display cars whose mileage is above the average mileage of all cars.
Why?
 Here you apply formula-based computation + comparison + filtering, just like the employee salary example, but with a different real-world scenario.
*/
import java.util.*;

class Car {
    private int id;
    private String model;
    private int fuel;
    private int distance;
    private double mileage;

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void calculateMileage() {
        mileage = (double) distance / fuel;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getMileage() {
        return mileage;
    }

    void showCar() {
        System.out.println(id + "\t" + model + "\t" + mileage);
    }
}

public class PojoQ3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Car[] cr = new Car[5];

        for (int i = 0; i < cr.length; i++) {
            cr[i] = new Car();

            System.out.println("Enter Car Id:");
            cr[i].setId(sc.nextInt());

            System.out.println("Enter Model:");
            cr[i].setModel(sc.next());

            System.out.println("Enter Fuel Consumed:");
            cr[i].setFuel(sc.nextInt());

            System.out.println("Enter Distance Travelled:");
            cr[i].setDistance(sc.nextInt());

            cr[i].calculateMileage();
        }

        // Best mileage & average
        Car bestCar = cr[0];
        double totalMileage = 0;

        for (int i = 0; i < cr.length; i++) {
            totalMileage += cr[i].getMileage();

            if (cr[i].getMileage() > bestCar.getMileage()) {
                bestCar = cr[i];
            }
        }

        double avgMileage = totalMileage / cr.length;

        System.out.println("\nCar with Best Mileage:");
        bestCar.showCar();

        System.out.println("\nCars with Mileage Above Average:");
        for (int i = 0; i < cr.length; i++) {
            if (cr[i].getMileage() > avgMileage) {
                cr[i].showCar();
            }
        }
    }
}