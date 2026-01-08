/*
Q1. WAP to input number from keyboard and print its table? 

*/
import java.util.Scanner;
	class Q1Table{
		public static void main(String args[]){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int i=1;
		
		
		System.out.println("multipliction table of" +num+" :");
		while(i<=10){
			System.out.println(num*i);
			i++;
			
			
			
		}
		
		}
	}