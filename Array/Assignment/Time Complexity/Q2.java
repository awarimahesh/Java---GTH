/*Q2. Write a Java program to search a given element in an array using linear search.
Explanation
Compare each element with the target.
Stop if found.


Time Complexity
Best case: O(1)
Worst case: O(n)
Example : Array: {5, 8, 2, 9}
Search: 2  —->  Element found at index 2*/
import java.util.*;
public class Q2{
	public static void main(String args[]){
		
		int a[]={5,8,2,9};
		int index=-1;
		int target=2;
		boolean found=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==target){
				index=i;
				found=true;
				break;
			}
		}
			if(found){
			System.out.println("found index is :"+index);
			}
			
			else{
				System.out.println("not found:");
			}
			
		
	}
}