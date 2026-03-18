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
	private String name;
	private int age;
	
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	} 
	
	//getter
	
	public Strinng getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public void displayPerson(){
		System.out.println("Person name:"+getName());
		System.out.println("Person ahe :"+getAge());
	}
}
class Employee extends Person{
	private String emailid;
	private int salary;
	
	//setter
	public void setEmailid(String emailid){
		this.emailid=emailid;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	
	//Getter
	
	public String getEmailid(){
		return emailid();
	}
	public int getSalary(){
		return salary;
	}
	public void displayEmployee(){
		system.out.println("Employee Email id:"+getEmailid());
		System.out.println("Employee salary"+getSalary());
	}
	
}
class Manager extends Employee{
	private String department;
	private int bonus;
	
	//setter method
	public void setDepartment(String department){
		this.department=department;
	}
	public void setBonus(int bonus){
		this.bonus=bonus;
	}
	
	//getter 
	public String getDepartment(){
		return department;
	}
	public int getBonus(){
		return bonus;
	}
	
	public void dispalyManager(){
		System.out.println("Manger depart ment+"+getDepartment());
		System.out.println("Manger bonus is :"+getBonus());
	}
}
public class Q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Manager m = new Manager();
		
		System.out.println("Enter manger depart ment and bonus");
		String department=sc.next;
		int bonus=sc.nextInt();
		
		m.setDepartment(department);
		m.setBonus(bonus);
		
		m.dispalyManager();
		
		Employee e = new Employee ();
		
		System.out.println("Enter employe Email id and Salary:");
		String emailid=sc.next();
		int salary=sc.nextInt();
		
		e.setEmailid(emailid);
		e.setSalary(salary);
		
		e.displayEmployee();
		
		
		Person p = new Person ();
		System.out.println("Enter Person Name and Age");
		
		String name =sc.next();
		int age = sc.nextInt();
		
		p.setName(name);
		p.setAge(age);
		p.displayPerson();
		
		System.out.println("-----------------------------------------");
	}
}