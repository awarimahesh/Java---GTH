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
import java.uti.*;
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
	
}
