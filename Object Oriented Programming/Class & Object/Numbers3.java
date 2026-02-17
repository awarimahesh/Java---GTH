/*
3. Compare Two Numbers
Create a class NumberComparison with a method compare that 
checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.

*/
import java.util.*;
class Numbers{
	void compare(int a,int b)
	{
		if(a>b)
		{
			System.out.println("Ais greter:");
		}
		else if(a<b)
		{
			System.out.println("B is greter number:");
		}
		else
		{
			System.out.println("Number are Equal:");
		}
	}
}
public class Numbers3{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number 1st");
			int a=sc.nextInt();
			System.out.println("Enter the second number:");
			int b=sc.nextInt();
			
			Numbers na=new Numbers();
			
			na.compare(a,b);
		}
	}
	
