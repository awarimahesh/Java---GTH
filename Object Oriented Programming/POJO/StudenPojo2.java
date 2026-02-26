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
	private int rollno;
	private String name;
	private int marks;
	private String grade;
	
	public void setRollno(int rollno){
		this.rollno=rollno;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setMarks(int marks){
		this.marks=marks;
	}
	public void setGrade(String grade){
		this.grade=grade;
	}
	public int getRollno(){
		return rollno;
		
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
public class StudenPojo2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Student std=new Student();
		
		System.out.println("Enter student No:");
		int rollno=sc.nextInt();
		
		System.out.println("Enter Student name:");
		String name=sc.next();
		
		System.out.println("Enter student marks:");
		int marks=sc.nextInt();
		
		std.setRollno(rollno);
		std.setName(name);
		std.setMarks(marks);
		
		 if (std.getMarks() >= 75) {
            std.setGrade("A");
        } else if (std.getMarks() >= 60) {
            std.setGrade("B");
        } else if (std.getMarks() >= 50) {
            std.setGrade("C");
        } else {
            std.setGrade("Fail");
        }
		System.out.println("Student details:");
		System.out.println("Roll no"+std.getRollno());
		System.out.println("Name"+std.getName());
		System.out.println("Marks"+std.getMarks());
		System.out.println("Grade is:"+std.getGrade());
	}
	
}