/*Problem Statement
Given a sorted integer array and a target sum, check whether a pair exists whose sum equals the target.
Two Pointer Explanation
One pointer at start, one at end.


If sum is smaller → move start pointer.
If sum is larger → move end pointer.


Logical Operations Used
Arithmetic addition


Conditional comparisons
Loop logic
*/
import java.util.*;
public class Q5{
	public static void main(String args[]){
		
		int a[]={1,2,3,4,5,6};
		
		int targetsum=25;
		int i=0;
		int j=a.length-1;
		
		boolean found=false;
		while(i<j){
			int sum=a[j]+a[j];
			if(sum==targetsum){
				found=true;
				break;
			}
			else if(sum<targetsum){
				i++;
			}
			else{	
				j--;
			}
		}
			if(found){
				System.out.println("pair is exist:");
			}
			else{
				System.out.println("pair not :");
			
			
		}
	}
}