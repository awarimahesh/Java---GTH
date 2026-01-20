/*
 Reverse a Number

Problem: Write a function that reverses a given integer.

Input:
n = 1234

Output:
4321

*/
import java.util.*;
public class Q6{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the integer:");
		int no=sc.nextInt();
		
		int  result=reverseNumber(no);
		System.out.println("revers nuber is:"+result);
		
	}
	
	public static int reverseNumber(int n){
		int rev=0;
		while(n!=0){
		int digit=n%10;
		rev=rev*10+digit;
		n=n/10;
		
		}
		return rev;
	}
}