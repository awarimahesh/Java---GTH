/*
Q20. Create a class with a method print() that:
Prints a simple message
Prints a message multiple times based on a number passed
Use function overloading.
Explanation: This question shows how the same method name can be reused 
to perform similar output tasks with different parameters.

*/
import java.util.*;
class Q20{
	public static void main(String args[]){
		
	Q20 obj=new Q20();
	obj.print();
	obj.print(3);
	}
	void print(){
		System.out.println("Hello Mahesh:");
	}
	void print(int n){
		for(int i=1;i<=n;i++){
		System.out.println("Hello Mahesh:");
	}
	}
}
