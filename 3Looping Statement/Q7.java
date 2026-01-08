/*
Q7. WAP to input number and check number is duck or not  
	Input: 1024  - it is duck number  
	Input: 12345 - it is not duck number 

*/
import java.util.Scanner;
	class Q7{
		public static void main (String args[]){
			Scanner sc =new Scanner (System.in);
			System.out.println("Enter the number:");
			int num = sc.nextInt();
			
			int temp=num;
			boolean isDuck=false;
			while(temp>0){
				int digit=temp%10;
				if(digit==0)
				{
					isDuck=true;
					break;
				}
				temp=temp/10;
				
			}
			if (isDuck)
			{
				System.out.println("Is duck numer:");
				
			}
			else
			{
				System.out.println("not duck:");
			}
		}
	}