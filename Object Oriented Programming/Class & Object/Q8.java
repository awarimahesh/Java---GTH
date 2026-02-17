/*
8. Find Square of a Number
Create a class SquareFinder with a method 
square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods.

*/
import java.util.*;
class Square{
	int SquareFinder(int no){
		int square=no*no;
		return square;
	}
	
	
}
public class Q8{
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int no=sc.nextInt();
		
		Square sq=new Square();
		int result=sq.SquareFinder(no);
		System.out.println("The squre is:"+result);
	}
	
} 
