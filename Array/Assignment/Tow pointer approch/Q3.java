/*Q3. Reverse an Integer Array In-Place
Problem Statement
Reverse an integer array without using extra space.
Two Pointer Explanation
Start pointer at index 0, end pointer at n-1.


Swap elements at both pointers.
Move pointers toward the center.
Logical Operations Used
Swap using temporary variable


Loop termination condition
Index manipulation
*/
import java.util.*;
public class Q3{
	public static void main(String args[]){
	int a[]={1,2,3,4,5,6};
	
	int i=0;
	int j=a.length-1;
	while(i<j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	
	i++;
	j--;
	}
	for(int k=0;k<a.length;k++){
		System.out.println(a[k]);
	}
	
}
}