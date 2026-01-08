/*
Q13. Write a java program to enter a number and print its reverse.
*/
import java.util.Scanner;
	class Rev{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Eneter the number:");
			int num= sc.nextInt();
			int reverse=0;
			for(int i=num;i>0;i=i/10){
				int digit=i%10;
				reverse=reverse*10+digit;
				
				
				
			}
			System.out.println(""+reverse);
			
		}
	}