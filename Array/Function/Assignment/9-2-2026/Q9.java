/*Q9. Write a Java program using a void function to check whether a number is a Strong Number.
A Strong Number is a number whose sum of factorials of digits equals the number.
Explanation
Extract each digit
Calculate factorial using a loop (no recursion)
Add factorials
Compare with original number
Print result inside function
https://meet.google.com/aup-vqrp-hbv
*/
import java.util.*;
class Q9{
	public static void main(String args[]){
		StrongNumber(123);
		
	}
	public static void StrongNumber(int no){
		int originalno=no;
		int sum=0;
		
		
		while(no>0){
			int digit=no%10;
			int factorial=1;
				
			for(int i=1;i<=digit;i++){
				factorial=factorial*i;
			}
				sum=sum+factorial;
				no=no/10;
		}
			if(sum==originalno){
				System.out.println("Number is stronng number:");
			}
			else{
				System.out.println("Number is not strong number:");
			}
		}
		
	}

