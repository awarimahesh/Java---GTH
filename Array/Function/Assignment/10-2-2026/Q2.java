/*Q2. Write a method that takes an integer and returns 1 if the number is even, otherwise returns 0.
Explanation
If number is divisible by 2 → Even
Else → Odd
Method returns an integer value
Method Signature - static int isEven(int num)
Input - num = 7 
Output - Odd
*/

import java.util.*;
class Q2{
	public static void main(String args[]){
		
		int result=isEven(7);
		if(result==1){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd:");
		}
	}
	public static int isEven(int num){
		if(num%2==0){
			return 1;//even
		}
		else{
			return 0;//odd
		}
			
			
		
		}
	}
