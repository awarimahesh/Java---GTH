/*
Q4. Month Name and Days
Write a program that takes a number (1–12) as input and prints the corresponding month name and the number of days in that month. Use a 'switch' statement.

*/
import java.util.Scanner;
	class Q04{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter month:");
			int month =sc.nextInt();
			switch(month){
				
				case 1:
					System.out.println("Jan - 31");break;
				case 2:
					System.out.println("feb -28 ");break;
				case 3:
					System.out.println("mar - 31");break;
				case 4:
					System.out.println("Apr - 31");break;
				case 5:
					System.out.println("May - 31");break;
				case 6:
					System.out.println("Jun - 31");break;
				case 7:
					System.out.println("Jul - 31");break;
				case 8:
					System.out.println("Oug - 31");break;
				case 9:
					System.out.println("Sep - 31");break;
				case 10:
					System.out.println("oct - 31");break;
				case 11:
					System.out.println("Nov - 31");break;
				case 12:
					System.out.println("Dec - 31");break;
				default:System.out.println("Enter valid month:");
				
			}
		}
	}
 