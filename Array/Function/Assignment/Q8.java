/*8. Sum of Digits

Problem: Write a function that returns the sum of digits of a number.

Input:
n = 456

Output:
15
*/
import java.util.*;
public class Q8{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the digit:");
		int no=sc.nextInt();
		
		int result=sumDigit(no);
		System.out.println("sum of digit is:"+result);
		
	}
	public static int sumDigit(int n){
		int sum=0;
		while(n!=0){
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
			
		}
		return sum;
	}
}