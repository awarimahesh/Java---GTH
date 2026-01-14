/*Q2. Count Pairs With Equal Sum from Ends
Problem Statement
Given an integer array, count how many pairs from both ends have equal sum.
Two Pointer Explanation
Place one pointer at the beginning and one at the end.


Calculate the sum of both elements.


If the sum matches the required condition, increase count.
Move pointers accordingly.


Logical Operations Used
Addition


Comparison operators
Conditional branching
*/
import java.util.*;
public class Q2{
	public static void main(String args[]){
		int a[]={1,2,3,4,5};
		
		int i=0;
		int j=a.length-1;
		int count=0;
		
		int targetsum=a[i]+a[j];
		
		while(i<j){
		int sum=a[i]+a[j];
		if(sum==targetsum){
			count++;
		}
		
		i++;
		j--;
		}
		System.out.println(count);
	}
}