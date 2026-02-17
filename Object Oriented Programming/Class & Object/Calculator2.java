/*. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers.
 Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/
import java.util.*;
class Calculator{
	int add(int a,int b){
		return a+b;
	}
	int subtract(int a,int b){
		return a-b;
	}
	int multiplay(int a,int b){
		return a*b;
	}
	double divide(double a,double b){
		return a/b;
	}
	
}
public class Calculator2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Calculator cl=new Calculator();
		
		System.out.println("Enter the first value:");
		int a=sc.nextInt();
		
		System.out.println("Enter second value:");
		int b=sc.nextInt();
		
		System.out.println("Addition is"+cl.add(a,b));
		System.out.println("Subtraction is"+cl.subtract(a,b));
		System.out.println("Multiplication is"+cl.multiplay(a,b));
		System.out.println("Divide is"+cl.divide(a,b));
		
	}
}