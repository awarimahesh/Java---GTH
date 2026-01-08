/*Q12. Write a java program to calculate the product of digits in a number.
*/
import java.util.Scanner;
	class Product{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Eneter the number:");
	int num = sc.nextInt();
	int product=1;
	for(int i=num;i>0;i=i/10){
		int digit=i%10;
		product=product*digit;
		
		
	}
	System.out.println("Product of this number is:"+product);
	
	}
	}