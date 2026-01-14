/*Q6. Count Number of Valid Mirror Pairs
Problem Statement
Count how many pairs from start and end have equal values.
Two Pointer Explanation
Compare elements from both ends.


If equal, increase count.
Move pointers inward.


Logical Operations Used
Equality check


Counter increment
Pointer logic

*/
import java.util.*;
class Q6{
	public static void main(String args[]){
		
		int a[]={1,2,3,2,1};
		
		int i=0;
		int j=a.length-1;
		int count=0;
		while(i<j){
			
			if(a[i]==a[j]){
				count++;
				
			}
			i++;
			j--;
			
		}
		System.out.println("Same mirror is:"+count);
		
	}
}