/*
1) Employee Salary Calculation
Create a class Employee with:
  • name
  • basicSalary
Create a subclass Manager that:
    • Adds bonus
    • Calculates total salary
    Task: Write a program to display employee name and total salary.

*/
import java.util.*;

class Employee{
    private String name;
    private double basicSalary;
    
    public void setName(String name){
        this.name=name;
    }
    public void setBasicSalary(double basicSalary){
        this.basicSalary=basicSalary;
    }
    
    public String getName(){
        return name;
    }
    public double getBasicSalary(){
        return basicSalary;
    }
}

class Manager extends Employee{
    private double bonus;
    
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    
    public double getBonus(){
        return bonus;
    }
    
    public double calculateTotalSalary(){
        return getBasicSalary()+bonus;
    }
}

public class Q1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        Manager ma=new Manager();
        
        System.out.println("Enter Name:");
        String name=sc.next();
        ma.setName(name);
        
        System.out.println("Enter Basic salary:");
        double basicSalary=sc.nextDouble();
        ma.setBasicSalary(basicSalary);
        
        System.out.println("Enter bonus:");
        double bonus=sc.nextDouble();
        ma.setBonus(bonus);
        
        System.out.println("Name is "+ma.getName());
        System.out.println("Total Salary: "+ma.calculateTotalSalary());
    }
}