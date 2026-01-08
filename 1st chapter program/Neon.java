//Write a java program to check whether number is neon or not.
//Input : 9
//Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
import java.util.Scanner;
	class Neon{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number:");
		int num =sc.nextInt();
		int sum=0;
		
		
		int Square=num * num;
		while(Square>0){
			sum=sum+(Square%10);
			Square=Square/10;
		}
		if(sum==num)
		System.out.println("Number is neon:");
		else
		System.out.println("number is not neon:");
		
		}
	}