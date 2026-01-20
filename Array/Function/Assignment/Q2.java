/*2. Check Even or Odd

Problem: Write a function that checks whether a given number is even or odd.

Input:
n = 7

Output:
Odd*/
import java.util.*;
public class Q2{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number:");
		int no=sc.nextInt();
		
		checkevenodd(no);
		
	}
	public static void checkevenodd(int n){
		if(n%2==0){
			System.out.println("even:");
		}
		else{
			System.out.println("odd");
		}
	}
}