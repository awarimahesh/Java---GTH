//Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene

import java.util.Scanner;
public class Q03{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	if (a == b && b==c && c==a) {
		System.out.println("equilateral");
	}
	else if ( (a==b) || (b==c) || (c==b) ) {
		System.out.println("isoscale");
	}
	else{
		System.out.println("scalene");
	}
	}
}