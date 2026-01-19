/*Q5. Write a Java program to find duplicate elements in an array.
Explanation
Use nested loops.
Compare each element with all others.
Time Complexity
O(n²)
Example :- Array: {1, 2, 3, 2}	Duplicate element = 2
*/
import java.util.*;
public class Q4{
	public static void main(String args[]){
		
		int a[]={1,2,3,2};
		
		for(int i=0;i<a.length;i++){
			for (int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println(""+a[i]);
				}
			}
		}
	}
}