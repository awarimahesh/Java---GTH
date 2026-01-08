// Write a Java program to check whether a triangle is valid or not.

import java.util.Scanner;
	class TriangleTer{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the triangle value:");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		String ABC =(a+b>c && a+c>b && b+c>a ) ? "Is valid tringle ": "IS not valid Triangle";
		System.out.println("ABC is :"+ABC);
		sc.close();
		}
	}