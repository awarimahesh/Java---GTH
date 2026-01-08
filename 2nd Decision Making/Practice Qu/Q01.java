/*
Q1. Day of the Week
Write a program that takes a number (1–7) as input and prints the corresponding day of the week using a 'switch' statement.
(Example: 1 → Monday, 2 → Tuesday, etc.)
*/
import java.util.Scanner ;
	class Q01{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num1=sc.nextInt();
		switch(num1)
			case 1:System.out.println("Mon");break;
			case 2:System.out.println("Tuesday");break;
			case 3:System.out.println("Wen");break;
			case 4:System.out.println("Thu");break;
			case 5:System.out.println("Fri");break;
			case 6:System.out.println("Sat");break;
			case 7:System.out.println("Sun");break;
			default:System.out.pritnln("default");
		}
		
	}