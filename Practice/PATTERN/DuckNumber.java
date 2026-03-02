/*
Example : A Duck number is a positive number which has zeroes present in
 it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.

*/
import java.util.*;
public class DuckNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		int temp=num;
		boolean isDuck=false;
		while(temp>0){
			
			int digit=temp%10;
			
			if(digit==0){
				isDuck=true;
				break;
				
				
				
			}
			temp=temp/10;
		}
		if(isDuck){
			System.out.println("Number is Duck");
		}
		else{
			System.out.println("Number is not duck:");
		}
	}
}