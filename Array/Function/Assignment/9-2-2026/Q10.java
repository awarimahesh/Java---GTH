/*
Q10. Write a Java program that uses a void function to print the Fibonacci series up to N terms.
Explanation
Pass number of terms to the function
Use loop to generate series
Print each term inside the function
No recursion and no return type

*/
import java.util.*;
class Q10{
	public static void main(String args[]){
		
		Fibonacci(5);
		
	}
	public static void Fibonacci(int no){
		int first=0;
		int second=1;
		for(int i=1;i<=no;i++){
			System.out.println(first+"");
			int next=first+second;
			first=second;
			second=next;
		}
	}
}