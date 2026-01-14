/*Q9. Count Common Elements From Both Ends
Problem Statement
Count how many matching elements appear symmetrically from both ends.
Two Pointer Explanation
Compare left and right pointer values.


Increment count on matches.
Move pointers inward.


Logical Operations Used
Equality check


Increment operators
Pointer traversal
*/
import java.util.*;
public class Q9{
	public static void main(String args[]){
		int a[]={1,2,3,2,5};
		
		int i=0;
		int j=a.length-1;
		int count =0;
		while(i<j){
			if(a[i]==a[j]){
				i++;
				j--;
				
			
			
			}
			count++;
		}
		System.out.println(" "+count);
	}
}