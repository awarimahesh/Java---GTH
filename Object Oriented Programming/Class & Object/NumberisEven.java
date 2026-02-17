/*
4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a 
number is even or odd.
Explanation: Focuses on using modulus operator in logic.

*/
import java.util.*;
class NumberChecker{
	void isEven(int no){
		if(no%2==0){
			System.out.println("number is even:");
		}
		else{
			System.out.println("Number is odd:");
		}
	}

}
public class NumberisEven{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		
		NumberChecker nc=new NumberChecker();
		
		nc.isEven(no);
	}
}
