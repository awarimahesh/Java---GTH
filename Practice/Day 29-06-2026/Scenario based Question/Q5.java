/*
An employee management system has Permanent, Contract, and Intern employees. 
How would you implement salary calculation
*/
class Employee {
    double calculateSalary() {
        return 0;
    }
}

class PermanentEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 50000;
    }
}

class ContractEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 30000;
    }
}

class Intern extends Employee {
    @Override
    double calculateSalary() {
        return 15000;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Employee emp;

        emp = new PermanentEmployee();
        System.out.println("Permanent Salary = ₹" + emp.calculateSalary());

        emp = new ContractEmployee();
        System.out.println("Contract Salary = ₹" + emp.calculateSalary());

        emp = new Intern();
        System.out.println("Intern Salary = ₹" + emp.calculateSalary());
    }
}