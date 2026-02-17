/*

6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the 
largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.

*/
import java.util.*;
class MaxFinder{
	int findMax(int a,int b,int c){
		if(a>b && a>c){
			return a;
		}
		else if(a<b&&c<b){
			return b;
		}
		else{
			return c;
		}
	}
}
public class Maximum6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		MaxFinder mf =new MaxFinder();
		int max=mf.findMax(a,b,c);
		
		
		System.out.println("Maximum is"+max);
	}
	
}