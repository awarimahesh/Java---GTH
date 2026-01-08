//Q22. Write a java program to check whether a number is palindrome or not. 
import java.util.Scanner;
	class Q22{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	
	int num=sc.nextInt();
	int orignal=num;
	int rev=0;
	
	while(num>0){
		int digit=num%10;
		rev=rev*10+digit;
		num=num/10;
	}
	if(rev==orignal)
		System.out.println("palindrome number:");
	else
		System.out.println("is not palindrome:");
		}
	}			