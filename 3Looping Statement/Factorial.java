/*
Q2. WAP to input number and calculate its factorial?

*/
import java.util.Scanner;
	class Factorial{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=num){
			fact=fact*i;
			
			i++;
			
			
		}
		System.out.println("factorial is :"+fact);
		}
	}