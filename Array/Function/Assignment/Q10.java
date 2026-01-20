/*10. Check Palindrome Number

Problem: Write a function that checks whether a number is a palindrome.

Input:
n = 121

Output:
Palindrome
keep
*/
import java.util.*;
class Q10{
	public static void main(String arg[]){
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("enter the number:");
		int no=sc.nextInt();
		
		isPalindrom(no);
	}
	public static void isPalindrom(int n){
		int original=n;
		int rev=0;
		while(n!=0){
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(original==rev){
			System.out.println("palindrom");
		}
		else{
			System.out.println("not palindrom:");
		}
	}
}