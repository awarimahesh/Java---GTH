/*
1) Person → Employee → Manager
Create three classes:
• Person
	o name
	o age
	o displayPerson()
• Employee (inherits Person)
	o empId
	o salary
	o displayEmployee()
• Manager (inherits Employee)
	o department
	o bonus
	o displayManager()
Task: Create an object of Manager and display all details using inherited methods.

*/
import java.util.*;
class Person{
	protected  String name;
	protected  int age;
	
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	} 
	
	
	public void displayPerson(){
		System.out.println("Person name:"+name);
		System.out.println("Person age :"+age);
	}
}
class Employee extends Person{
	protected  String emailid;
	protected  int salary;
	
	//setter
	public void setEmailid(String emailid){
		this.emailid=emailid;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	
	
	
	public void displayEmployee(){
		System.out.println("Employee Email id:"+emailid);
		System.out.println("Employee salary"+salary);
	}
	
}
class Manager extends Employee{
	protected  String department;
	protected  int bonus;
	
	//setter method
	public void setDepartment(String department){
		this.department=department;
	}
	public void setBonus(int bonus){
		this.bonus=bonus;
	}
	
	
	
	public void dispalyManager(){
		System.out.println("Manger depart ment+"+department);
		System.out.println("Manger bonus is :"+bonus);
	}
}
public class Q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Manager m = new Manager();
		
		// MAnager detail
		System.out.println("Enter Person name");
		String name=sc.next();
		System.out.println("Enter person Age :");
		int age=sc.nextInt();
		
		//Employee details 
		
		System.out.println("Enter employe Email ");
		String emailid=sc.next();
		System.out.println("Enter Employee Salary:");
		int salary=sc.nextInt();
	
		//Manager detail
		
		System.out.println("Enter manger department:");
		String department =sc.next();
		
		System.out.println("Entre manger Bonus:");
		int bonus = sc.nextInt();
		
		//set value
		
		m.setName(name);
		m.setAge(age);
		m.setEmailid(emailid);
		m.setSalary(salary);
		m.setDepartment(department);
		m.setBonus(bonus);
		
		//display detail
		System.out.println("----------------------------------");
		
		m.displayPerson();
		m.displayEmployee();
		m.dispalyManager();
		
		
		System.out.println("-----------------------------------------");
	}
}