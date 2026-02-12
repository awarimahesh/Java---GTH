/*
Q17. Create a class with a method named area() to calculate:
Area of a square
Area of a rectangle


Use function overloading.
Explanation:  Here, the method name remains the same,
 but the number of parameters changes. This shows how Java supports
 overloading based on parameter count.
*/
import java.util.*;
public class Q17{
	public static void main(String args[]){
		
		int square=area(10);
		int rectangle=area(2,3);
		
		System.out.println("Area of a Square"+square);
		System.out.println("Area of rectangle"+rectangle);
	}
	public static int area(int no){
		return no*no;
	}
	public static int area(int length,int breath){
		return length*breath;
		
	}
}