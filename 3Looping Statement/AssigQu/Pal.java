/*
Q14. Write a java program to check whether a number is palindrome or not.

*/
import java.util.Scanner;
public class Pal{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int num=sc.nextInt();
			int temp=num;
			int reverse=0;
			for (int i=num;i>0;i=i/10){
				int digit =i%10;
				reverse=reverse*10+digit;
				
			}
			if (reverse==tem){
				System.out.println("Number is palindrom");
				
			}
			else{
				System.out.println("Number is not palindrom:");
			}
			
		}
		
	}