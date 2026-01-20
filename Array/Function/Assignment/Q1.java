/*1. Sum of Two Numbers

Problem: Write a function that takes two integers and returns their sum.

Input:
a = 10, b = 20

Output:
30
*/
import java.util.*;
class Q1{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Number 1 st number:");
	int a=sc.nextInt();
	System.out.println("enter the second number:");
	int b=sc.nextInt();
	
	int result=getsum(a,b);
	System.out.println("Sum is"+result);
}
public static int getsum(int a,int b){
	int sum=a+b;
	return sum;
}
}