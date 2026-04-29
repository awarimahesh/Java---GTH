/*9. Find Square of a Number

Problem: Write a function that returns the square of a given number.

Input:
n = 9

Output:
81
*/
import java.util.*;
class Q9{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int no=sc.nextInt();
			
		int result=squre(no);
		System.out.println("NUmber squre is:"+result);
		
		
	}
	public static int squre(int n){
		return n*n;
	}
	
}
