/*
Q1.Write a function that accepts two integers and prints their sum.
Explanation
Function takes two numbers as parameters
Calculates sum inside the function
Prints the result using System.out.println()
Example
Input: 10, 20              Output: Sum = 30

*/

import java.util.*;
public class Q1{
public static void main(String args[]){
	calAdd(10,20);
	
	}
	public static void calAdd(int x,int y){
		System.out.println("Addition is:"+(x+y));
	}
}