/*Q1. Write a Java method that takes two integers as input and returns their sum.
Explanation
The method receives two numbers
It adds them
Returns the result to the main method
Method Signature - static int getSum(int a, int b)
Input - a = 10, b = 20
Output - Sum = 30
*/
import java.util.*;
class Q1{
	public static void main(String args[]){
		
		
		int result=getSum(10,20);// method call
		System.out.println(""+result);
	}
	public static int getSum(int x,int y){
		int sum=x+y;// addition
		return sum;//result return
	}
}