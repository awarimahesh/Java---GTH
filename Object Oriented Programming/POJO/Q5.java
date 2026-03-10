/*
Q5. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). 
Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. 
You practice object encapsulation (POJO) and multiple computations.
*/
import java.util.*;
class Student{
	private int rollno;
	private String name;
	private int marks[];
	
	public void setRollno(int rollno){
		this.rollno=rollno;
	}
	
	public void setName(String name){
		this.name=name;
		
	}
	
	public void setMarks(int marks[]){
		this.marks=marks;
		
	}
	public int  getRollno(){
		return rollno;
	}
	public String getName(){
		return name;
	}
	public int[] getMarks(){
		return marks;
	}
	
}
public class Q1{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many student:");
		int no=sc.nextInt();
		Student []s=new Student[no];
		for(int i=0;i<no;i++){
			s[i]=new Student();
			
			System.out.println("Enter student roll no");
			int rollno=sc.nextInt();
			s[i].setRollno(rollno);
			
			System.out.println("Enter student Name:");
			String name=sc.next();
			s[i].setName(name);
			
			int marks[]=new marks[3];
			System.out.println("Enter student subject marks:");
			for(int j=0;j<3;j++){
				marks[j]=sc.nextInt();
			}
			s[i].setMarks(marks);
			
			
		}
	}
}