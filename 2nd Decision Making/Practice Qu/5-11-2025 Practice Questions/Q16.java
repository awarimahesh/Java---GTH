//Q16. Write a java program to find a minimum between three numbers.
import java.util.Scanner;
	class Q16{
		public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a<=b && a<=c)
			System.out.println("A is a minimum number");
		else
			if(b<=a && b<=c)
			System.out.println("B is Minimum number:");
		else
		System.out.println("C is minimum number:");
		
		
		}
	}