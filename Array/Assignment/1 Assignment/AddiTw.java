/*
WAP to calculate addition of two matrix 

*/

import java.util.*;
public class AddiTw{
	public static void main(String args[]){
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first matrix element:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second matrix element:");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<a[i].length;j++){
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Addition of Matrix:");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<a[i].length;j++){
			c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Display first matrix element:");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Display Second matrix element:");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(b[i][j]);
			}
		System.out.println();
		}
		System.out.println("Display addition of  matrix element:");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
}