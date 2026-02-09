/*Question 2: Overloading with Different Data Types

Write a class Printer with overloaded print() methods:

print(int value)

print(String value)

print(double value)

👉 Call all methods from main() and display output.
*/
import java.util.*;
public class Q4{
	public static void main(String args[]){
		
		Printer p = new Printer();
		p.print(100);
		p.print("Mahesh");
		p.print(10.4);
	}
}
class Printer{
	public static void print(int value){
		System.out.println("integr value:"+value);
	}
	public static void print(String value){
		System.out.println("String value"+value);
		
	}
	public static void print(double  value){
		System.out.println("Double  value is:"+value);
	}
}