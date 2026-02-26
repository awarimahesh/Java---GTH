/*
Q2.Create a POJO class Student with:
rollNo (int)
name (String)
marks (int)


Calculate grade:
Marks ≥ 75 → Grade A
Marks 60–74 → Grade B
Marks 50–59 → Grade C
Below 50 → Fail
Display student details with grade.
Explanation:
Access marks using getter.
Apply grading logic in main method.
Input:
Enter Roll No: 1
Enter Name: Sneha
Enter Marks: 68

Output:
Roll No: 1
Name: Sneha
Marks: 68
Grade: B

*/
import java.util.*;
class Student{
	
	public void setRollno(int rollno){
		this.rollno=rollno;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setMarks(int m){
		this.marks=marks;
	}
	public void setGrade(String grade){
		this.grade=grade;
	}
	public int grtId(){
		return id;
		
	}
	public String getName(){
		return name;
	}
	public int getMarks(){
		return marks;
	}
	public String getGrade(){
		return grade;
	}

	
	
	
}
public class PojoQ2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Student std=new Student();
		
		System.out.println("Enter student id:");
		int id=sc.nextInt();
		
		System.out.println("Enter Student name:");
		String name=sc.next();
		
		System.out.println("Enter student marks:");
		int marks=sc.nectInt();
		
		std.setId(id);
		std.setName(name);
		std.setMarks(marks);
		
		if(std.getMarks()<50){
			System.out.println("garde"= "fail");
		}
		else if(std.getMarks()>50 && std.getMarks<=60){
			System.out.println("garde"="c");
		}
		else if(std.getMarks()>60 && std.getMarks()<70){
			System.out.println("grade"="B");
		}
		else {
			System.out.println("Grade is"="A");
		}
		System.out.println("Student details:");
		System.out.println("ID"+std.getid());
		System.out.println("Name"+std.getName());
		System.out.println("Marks"+std.getMarks());
		System.out.println("Grade is:");
	}
	
}