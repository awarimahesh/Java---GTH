//Q22. Write a program to find first and last digit of a number without using loop in three digit.

import java.util.Scanner;
	 class FirstLastDigit{
		public static void main (String args[]){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int no =sc.nextInt();
			
			int last=no%10;
			System.out.println("This is last number:"+last);
			
			int first=no/100;
			System.out.println("This is first number:"+first);
			
			sc.close();
		
		}
	}