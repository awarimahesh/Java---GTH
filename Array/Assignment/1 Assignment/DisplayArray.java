/*
Q1. Write a Java program to input an array & display it.
Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
Output:
 10 20 30 40 50

*/
import java.util.*;
	class DisplayArray{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int a[];
			
			System.out.println("Enter the array size:");
			int size=sc.nextInt();
			
			a=new int [size];
			
			System.out.println("Enter the Element:");
			for(int i=0;i<a.length;i++){
				 a[i]=sc.nextInt();
				
			}
			System.out.println("final array:");
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
		}
	}
}