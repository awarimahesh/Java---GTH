//Write a Java program to check whether a number is positive , negative or zero.
import java.util.Scanner;
	class TerNumberEvenOdd{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num =0;
		
		System.out.println("Enter the number:");
		
		String result=(num>0)? "Number is positive":(num<0)?"number is negative":"zero";
		System.out.println("number is :"+result);
		}
	}