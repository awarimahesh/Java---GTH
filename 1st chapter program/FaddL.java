//Write a program to calculate sum of first and last digit of a number without using loop.
//Input : 123
//Output : 4

import java.util.Scanner;
	 class FaddL{
		public static void main (String args[]){
			Scanner sc= new Scanner(System.in);
			int no=sc.nextInt();
			
			int last=no%10;
			System.out.println("Last number is a:"+last);
			
			int first=no/100;
			System.out.println("First number is a:"+first);
			
			int sum=last+first;
			System.out.println("first and last number addition:"+sum);
			
			sc.close();
			
		
			}
		}