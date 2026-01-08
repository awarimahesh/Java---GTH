/*
Q5. WAP to input number and reverse it.

*/
import java.util.Scanner;
	class Q5{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the digiit:");
			int num =sc.nextInt();
			
			int temp=num;
			int reverse=0;
			while(temp!=0){
				int digit=temp%10;
				reverse=reverse*10+digit;
				temp=temp/10;
				
			}
			System.out.println("Revers number is :"+reverse);
			
		}
	}