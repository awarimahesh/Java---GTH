/*
7. Count Digits

Problem: Write a function that counts the number of digits in a given number.

Input:
n = 98765

Output:
5
*/
import java.util.*;
class Q7{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		
		int result=count(no);
		System.out.println("count is :"+result);
	}
	public static int count(int n){
		int count=0;
		while(n!=0){
			n=n/10;
			count++;
			
		}
		return count;
			
		}
	}
