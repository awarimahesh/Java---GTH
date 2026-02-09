/*Question 3: Overloading with Parameter Order Change

Create a class Employee that has two overloaded display() methods:

display(int id, String name)

display(String name, int id)

👉 Print employee details and observe how Java identifies the correct method.*/

import java.util.*;
class Q5{
	public static void main(String args[]){
		
		Employee emp=new Employee();
		emp.display(101,"mahesh");
		emp.display("mangesh",102);
		
	}
	}
	class Employee{
	public static void display(int ID,String name){
		System.out.println("Employ Id and Name:"+ ID);
		System.out.println("Employ name is :"+name);
	}
	public static void display(String name,int ID){
		System.out.println("employ name:"+name);
		System.out.println("Employee Id"+ID);
	
	
	
	}
}
