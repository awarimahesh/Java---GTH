//Q2. Write a Java program to check whether a triangle is valid or 
import java.util.Scanner;

public class Q02{
	
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Three sides : ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	if (a + b > c) {
		System.out.println("Valid Tringle");
	}
	else if (b + c > a) {
		System.out.println("VAlid Tringle");
	}
	else if (c + a > b) {
		System.out.println("Valid Tringle");
	}
	else{
		System.out.println("Invalid Tringle");
	}
	}
}