/*
Q3. Write a function that accepts an integer N and prints numbers from 1 to N.
Explanation
Function receives value of N
Use a loop inside the function
Print numbers one by one
Example
Input: 5      — 1 2 3 4 5

*/
import java.util.*;
class Q3{
	public static void main(String args[]){
		
		Number(5);
	}
	public static void Number(int no){
		for(int i=1;i<=no;i++){
			System.out.println(""+i);
		}
	}
}