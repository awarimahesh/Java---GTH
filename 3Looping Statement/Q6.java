/*
Q6. WAP input number and check number is Armstrong or not? 

*/
import java.util.Scanner;
	class Q6{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		int temp=num;
		int sum=0;
		while(temp!=0){
			int digit=temp%10;
			sum=sum+digit*digit*digit;
			temp=temp/10;
		}
		
			if(sum==num)
			{
				System.out.println("This is armstrong number:");
			}
			else
			{
				System.out.println("Not armstrong number:");
			}
		
		}
	}