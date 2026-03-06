/*
Q2. Create a POJO class Student with:
rollNo
name
marks
Store N student records.
 Calculate :
Grade A → marks ≥ 75
Grade B → marks ≥ 60
Grade C → marks ≥ 40
Fail → marks < 40
Display student result with grade.
Explanation :
Create Student POJO.
Store student data in array of objects.
Use conditional statements to assign grade.
Print student details with grade.
 Input:
Enter number of students: 4

1
Riya
82

2
Sam
67

3
John
39

4
Pooja
58

Output :- 
Student Results:

1 Riya 82 Grade: A
2 Sam 67 Grade: B
3 John 39 Grade: Fail
4 Pooja 58 Grade: C

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
	
	public int getRollno(){
		return rollno;
	}
	
	public void setName(String name){
		this.name=name;	
	}
	public String getName(){
		return name;
	}
	
	public void setMarks(int marks){
		this.marks=marks;
	}
	public int getMarks(){
		return marks;
	}
	public void setGrade(String grade){
		this.grade=grade;
	}
	public String getGrade(){
		return grade;
	}
}
public class Student9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Student st=new Student();
		
		System.out.println("Enter student Rollno:");
		int rollno=sc.nextInt();
		
		System.out.println("Enter Student name");
		String name=sc.next();
		
		System.out.println("Enter student Marks:");
		int marks=sc.nextInt();
		
		st.setRollno(rollno);
		st.setName(name);
		st.setMarks(marks);
	
		
		if(st.getMarks()>=70){
			st.setGrade("A");
		}
		else if(st.getMarks()>=60){
			st.setGrade("B");
		}	
		else if(st.getMarks()>=35){
			st.setGrade("C");
		}
		else{
			st.setGrade("Fail");
		}
	
	System.out.println("Student details:");
	System.out.println("RollNo"+st.getRollno());
	System.out.println("Name:"+st.getName());
	System.out.println("Marks"+st.getMarks());
	System.out.println("Grade:"+st.getGrade());
	}
}