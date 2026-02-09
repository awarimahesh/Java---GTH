/*Question 1: Simple Function Overloading

Create a class Calculator that has three add() methods:

add(int a, int b)

add(int a, int b, int c)

add(double a, double b)

👉 Each method should print the sum.*/

import java.util.*;
public class Q3{
	public static void main(String args[]){
	Calculator  cal=new Calculator ();
	cal.add(10,20);
	cal.add(10,20,30);
	cal.add(10.4,5.3);
		
		}
	}
	class Calculator {
	public static void  add(int a,int b){
		System.out.println("int addition:"+(a+b));
	}
	public static void add(int a,int b,int c){
		System.out.println("Addition 3 digit is: "+(a+b+c));
	}
	public static void add(double a,double b){
		System.out.println("Sum of two double is:"+(a+b));
	}
	
}