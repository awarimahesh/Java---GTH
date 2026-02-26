/*
Q1. Create a POJO class Employee with the following fields:
empId (int)
name (String)
salary (double)
experience (int – in years)
Calculate bonus based on experience:
Experience ≥ 5 years → 10% bonus
Experience < 5 years → 5% bonus
Display employee details along with bonus amount 
and final salary.

Explanation:
Create POJO class with private variables.
Use getters to access values.
Calculate bonus using logic in main method.
Print final salary.
 Input:
Enter Employee ID: 101
Enter Name: Amit
Enter Salary: 50000
Enter Experience: 6
Output:
Employee ID: 101
Name: Amit
Original Salary: 50000.0
Bonus: 5000.0
Final Salary: 55000.0

*/
import java.util.*;
class Employee{
	private int id;
	private String name;
	private double salary;
	private int experience;
	
	public void setId(int id){
		this.id=id;
		
	}
	public void setName(String name){
		this.name=name;
		
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public void setExperience(int experience){
		this.experience=experience;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
	return name;
	}
	public double getSalary(){
		return salary;
		
	}
	public int getExperience(){
		return experience;
	}
}
public class EmpQ1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Employee emp=new Employee();
		
			System.out.println("Enter emp id:");
			int id=sc.nextInt();
			
			System.out.println("Enter emp name :");
			String name=sc.next();
			
			System.out.println("Enter emp Sallary :");
			double salary=sc.nextDouble();
			
			System.out.println("Expriance Enter:");
			int experience=sc.nextInt();
			
			emp.setId(id);
			emp.setName(name);
			emp.setSalary(salary);
			emp.setExperience(experience);
			
			double bonus;
			if(emp.getExperience()>=5){
				bonus=emp.getSalary()*0.10;
			}
			else{
				bonus=emp.getSalary()*0.05;
			}
			double finalsalary=emp.getSalary()+bonus;
			System.out.println("Employee details:");
			System.out.println("Employee id :"+emp.getId());
			System.out.println("Employee name is :"+emp.getName());
			System.out.println("Employe Salary"+emp.getSalary());
			System.out.println("Employ Bounus"+bonus);
			System.out.println("Final Salary is:"+finalsalary);
			
		}
		
	
}