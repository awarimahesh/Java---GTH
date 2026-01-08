/*
Q1. Write a Java program to input an array & display it.
Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
Output:
 10 20 30 40 50

*/
import java.util.Scanner;
	class DisplayArray{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int a[];
			int size=sc.nextInt();
			System.out.println("Enter array size:");
			a=new int[size];
			System.out.println("enter arry elemant:");
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
		}
	}