/*
Q8. WAP to input number from keyboard and search digit present in number or 
    not.

*/

import java.util.Scanner;
	class Q8{
		public static void main(String args[]){
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter the num:");
			int num=sc.nextInt();
			
			System.out.println("Enter found digit:");
			int digit = sc.nextInt();
			
			int temp=num;
			boolean found=false;
			
			while (temp>0){
				int d=temp%10;
				if(d==digit){
					found=true;
					break;
				}
				temp=temp/10;
			}
			if(found)
				System.out.println("Found ");
			else 
				System.out.println("not found ");
			
		}
	}