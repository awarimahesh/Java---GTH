//Write a Java program to check whether a number is a multiple of both 3 and 5 using logical AND (&&) operator.
//Input: 15
//Output: Multiple of both 3 and 5
import java.util.Scanner;
	class MultiplictionBoth{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		
		
		if(number % 3 ==0 && number %5 ==0){
		System.out.println("number is multiplay 3 and 5:");
		}
		else{
		System.out.println("number is not multiplay both:");
		}
			
			}
	}