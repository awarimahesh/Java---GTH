/*Q1. Check Whether an Integer Array Is a Palindrome
Problem Statement
Given an integer array, determine whether it reads the same from left to right and right to left.
Two Pointer Explanation
Use one pointer at the start and one at the end.


Compare elements at both pointers.


Move both pointers inward if elements match.
If any mismatch occurs, the array is not a palindrome.


Logical Operations Used
Equality comparison


Pointer increment & decrement
Loop control logic
*/

import java.util.*;
public class Q1{
	public static void main(String args[]){
		
		int arr[]={1,2,1};
		
		int left=0;
		int right=arr.length-1;
		
		boolean palindrom=true;
		while(left<right){
			if(arr[left]!=arr[right]){
				palindrom=false;
				break;
			}
			left++;
			right--;
			}
			for(int i=0;i<arr.length;i++){
				System.out.println(" "+arr[i]);
			}
		if(palindrom){
			System.out.println(" palindrom:");
		}
		else{
			System.out.println("not palindrom:");
		}
		
	}
}
