/*
4) Person and Student
Create a class Person with:
• name
• age
Create a subclass Student that:
• Adds marks
• Displays student details and grade.
Task: Calculate grade based on marks.

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
	public String getName(){
		return name;
		
	}
	public int getAge(){
		return age;
	}
	
	
}
class Student extends Person{
	private int marks;
	
	public void setMarks(int marks){
		this.marks=marks;
	}
	
	public void showDetail(){
		System.out.println("Name is"+getName());
		System.out.println("Age is"+getAge());
		System.out.println("Marks"+marks);
		
	}
	
	
	
	public void showGrade(){
		System.out.println("Grade is:");
		if(marks>70){
			System.out.println("A+");
		}
			
			else if(marks>60){
				System.out.println("B");
			}
			else if(marks>50){
				System.out.println("c");
			}
			else{
				System.out.println("fail");
			}
		}
	}
	

public class Q4{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		Student st = new Student();
		System.out.println("Enter student marks:");
		int marks=sc.nextInt();
		st.setMarks(marks);
		
		System.out.println("Enter age:");
		int age=sc.nextInt();
		st.setAge(age);
		
		System.out.println("Enter name:");
		String name=sc.next();
		st.setName(name);
		
		st.showGrade();
		st.showDetail();
	}
}