/*
Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects).
Store data for 5 students using an array of objects. Perform the following 
operations:

Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects,
 and conditional checks. You practice object encapsulation (POJO) and multiple 
 computations.
*/
import java.util.*;
class Student{
	private int rollno;
	private String name;
	private int []marks=new marks[3] ;
	
	public void  setRollno(int r){
		rollno=r;
	}
	public int getRollno(){
		return Rollno;
	}
	
	public void  setName(String n){
		Name=n;
	}
	public String getName(){
		return Name;
	}
	
	public void  setMarks(int m){
		Marks=m;
	}
	public int []getMarks(){
		return Marks;
	}
	//total sum
	
	public int getTotal(){
		int sum=0;
		for(int Marks:)
	}
}
public class Q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Student std[]=new Student[5];
		for(int i=0;i<std.length;i++){
			std[i]=new Student();
			System.out.println("Enter student Rollno,Name And Marks");
			int Rollno=sc.nextInt();
			sc.nextLine();
			String Name=sc.nextLine();
			int Marks=sc.nextInt();
			
			std[i].setRollno(Rollno);
			std[i].setName(Name);
			std[i].setMarks(Marks);
			
			
		}
		System.out.println("Display student data:");
		
		for(int i=0;i<std.length;i++){
			System.out.println(std[i].getRollno()+"\t"+std[i].getName()+"\t"+std[i].getMarks());
		}
	}
}