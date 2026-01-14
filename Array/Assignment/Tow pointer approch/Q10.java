/*Q10. Check Whether Array Is Symmetric
Problem Statement
Check whether an integer array is symmetric (mirror-equal).
Two Pointer Explanation
Left pointer and right pointer compare values.
If all pairs match → symmetric.


Logical Operations Used
Comparison


Loop break conditions
Boolean logic
*/

import java.util.*;
public class Q10{
	public static void main(String args[]){
		
		int a[]={1,2,3,4,3,2,1};
		
		int i=0;
		int j=a.length-1;
		
		boolean symmetric=false;
		
		while(i<j){
			if(a[i]==a[j]){
				symmetric=true;
				break;
			}
			i++;
			j--;
			
		}
		if(symmetric){
			System.out.println("AlL pair is symetric");
		}
		else{
			System.out.println("not symmetric:");
		}
		
	}
}