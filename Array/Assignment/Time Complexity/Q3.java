/*Q4. Write a Java program to check whether an array is sorted in ascending order.
Explanation
Compare adjacent elements.
If any arr[i] > arr[i+1], array is not sorted.
Time Complexity
O(n)
Example :- Array: {2, 4, 6, 8}
	       Output : Array is sorted.
*/
import java.util.*;
public class Q3{
	public static void main(String args[]){
		
		int a[]={2,4,6,8,};
		boolean sorted=true;
		for (int i=0;i<a.length-1;i++){
			if(a[i]>a[i+1]){
				sorted=false;
				break;
			}
		}
		if(sorted){
			System.out.println("sorted:");
		}
		else{
			System.out.println("not sorted:");
		}
	}
}