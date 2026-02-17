/*
11. Reverse a Number
Create a class NumberReverser with a method 
reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.

*/
import java.util.*;
class Reverse{
	void NumberReverser(int no){
		int sum=0;
		
		while(no!=0){
		int digit=no%10;
		sum=sum*10+digit;
		no=no/10;
		}
		System.out.println("revrse no is"+sum);
	}
}
public class Q11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int no=sc.nextInt();
		
		
		 Reverse re=new Reverse();
		 re.NumberReverser(no);
		 
	}
}