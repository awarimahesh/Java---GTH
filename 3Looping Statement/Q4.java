/*
Q4. WAP to input number and count its digit. 
	Input: 12345 

*/
import java.util.Scanner;
	class Q4{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Digit:");
			int digit=sc.nextInt();
			
			int count =0;
			int temp=digit;
			while(temp!=0){
				temp=temp/10;
				count++;
				
			
			
			
				
			}
			System.out.println("Digit count is :"+count);
			System.out.println("Number is :"+digit);
		}
	}