/*
Q20. Write a java program to swap first and last digits of a number.

*/
import java.util.*;
public class LastFirstSwap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		System.out.println("Befor Swaping number is:");
		System.out.println(num);
		
		int last= num%10;
		int first=num;
		int power=1;
		while(first>=10){
			first=first/10;
			power=power*10;
			
		}
		int middal=(num%power)/10;
		int result=last*power+middal*10+first;
		System.out.println("After Swapping:"   +result);
		}
	
}