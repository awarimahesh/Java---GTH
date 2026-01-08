//Q20. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators
import java.util.Scanner;
	class Q20{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	double sqrt=Math.sqrt(num);
	
	String result=(sqrt==(int)sqrt)?"Perfect Square root":"NOt perfect sqrt";
		System.out.println(result);
		
	
		
		}
	}