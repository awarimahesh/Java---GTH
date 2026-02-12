/*
Q18. Create a class with a method display() to:
Display only student name
Display student name and roll number
Use function overloading.
Explanation: This question demonstrates overloading 
using different numbers of parameters while
 performing similar tasks.
*/
import java.util.*;
class Q18{
	public static void main(String args[]){
		Q18 obj=new Q18();
		obj.display("mahesh");
		obj.display("mahesh",123);
		
	}
	public static void display(String name,int number){
		System.out.println(""+name);
		System.out.println(""+number);
	}
	public static void display(String name){
		System.out.println("Student name : "+name);
	}
}