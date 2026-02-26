/*
Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary,
 hra, and da. Store details of 5 employees using an array of objects. 
 Perform the following operations:
Calculate the gross salary foreach employee(gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average
 salary of all employees.


Explanation:
This covers aggregation + comparison + filtering. You’ll work with
 numerical calculations and finding max/average values.

*/
import java.util.*;

class Employee {
    private int id;
    private String name;
    private double bassal;
    private double hra;
    private double da;
    private double grosssalary;

    public void setId(int i) { id = i; }
    public int getId() { return id; }

    public void setName(String n) { name = n; }
    public String getName() { return name; }

    public void setBasSal(double bs) { bassal = bs; }
    public double getBasSal() { return bassal; }

    public void setHra(double h) { hra = h; }
    public double getHra() { return hra; }

    public void setDa(double d) { da = d; }
    public double getDa() { return da; }

    public void calculateGrossSalary() {
        grosssalary = bassal + hra + da;
    }

    public double getGrosssalary() {
        return grosssalary;
    }

    void showEmployee() {
        System.out.println(id + "\t" + name + "\t" + grosssalary);
    }
}

public class PojoQ2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[5];

        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee();

            System.out.println("Enter emp id:");
            emp[i].setId(sc.nextInt());

            System.out.println("Enter emp name:");
            emp[i].setName(sc.next());

            System.out.println("Enter basic salary:");
            emp[i].setBasSal(sc.nextDouble());

            System.out.println("Enter HRA:");
            emp[i].setHra(sc.nextDouble());

            System.out.println("Enter DA:");
            emp[i].setDa(sc.nextDouble());

            emp[i].calculateGrossSalary();
        }

        // Find max & average
        Employee maxEmp = emp[0];
        double totalSalary = 0;

        for (int i = 0; i < emp.length; i++) {
            totalSalary += emp[i].getGrosssalary();

            if (emp[i].getGrosssalary() > maxEmp.getGrosssalary()) {
                maxEmp = emp[i];
            }
        }

        double averageSalary = totalSalary / emp.length;

        System.out.println("\nEmployee with Maximum Salary:");
        maxEmp.showEmployee();

        System.out.println("\nEmployees with salary greater than average:");
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getGrosssalary() > averageSalary) {
                emp[i].showEmployee();
            }
        }
    }
}