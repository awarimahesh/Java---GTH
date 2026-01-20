/*4. Calculate Factorial

Problem: Write a function that calculates the factorial of a number.

Input:
n = 5

Output:
120
*/
import java.util.*;
class Q4{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the number:");
	int no=sc.nextInt();
		
	int result=factorial(no);
	System.out.println("factorial is:"+result);
	
	}
	public static int factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
			return fact;
		
		
	}
}