/*Write a java program to calculate the sum of digits in a number.
*/

import java.util.Scanner;
	class DigitSum{
		public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the digit:");
		int num = sc.nextInt();
		int sum=0;
		for (int i =num;i>0;i=i/10){
			int digit=i%10;
			sum=sum+digit;
		}
		System.out.println("Sumof digit is :"+sum);
		
		
		}
	}