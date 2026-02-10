/*Q4. Write a function that accepts two integers and prints the greater number.
Explanation
Compare both numbers using if-else
Print the greater number
Function does not return anything
Example
Input: 15, 25
Output: Maximum number is 25
*/
import java.util.*;
class Q4{
	public static void main(String args[]){
		
		GreNumber(15,25);
	}
	public static void GreNumber(int x,int y){
		if(x>y){
			System.out.println("Number is gretre:"+x);
		}
		else{
			System.out.println(" Number is greter:"+y);
		}
	}
}