/*
Q2. Write a function that accepts one integer and prints whether the number is Even or Odd.
Explanation
Use modulo operator %
If number % 2 == 0, print Even
Otherwise, print Odd
No return value used
Example
Input: 7        Output: Number is Odd

*/
import java.util.*;
public class Q2{
	public static void main(String args[]){
		Number(8);
		
	}
	public static void Number(int no){
		if(no%2==0){
			System.out.println("even Number");
		}
		else{
			System.out.println("Odd number:");
		}
	}
}