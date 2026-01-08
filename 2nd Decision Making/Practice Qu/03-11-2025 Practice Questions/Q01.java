//Q1. Write a Java program to check whether a number is even or odd.
import java.util.Scanner;
public class Q01{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	if (x % 2 == 0){
		System.out.println("Even Number : ");
	}
	else{
		System.out.println("Odd number : ");
	}
	}	
}