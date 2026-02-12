/*
Q12. Write a recursive function to calculate the factorial of a given number.
Explanation:
Factorial of n is n * factorial(n-1).
Base condition: factorial of 0 or 1 is 1.


Example: Input: 5		Output: 120

*/

import java.util.*;
public class Q12{
	public static void main(String args[]){
		int result=factorial(5);
		System.out.println(""+result);
	}
	public static int factorial(int no){
		if(no==0||no==1){
			return 1;
		}
		
		return no*factorial(no-1);
		
	}
}