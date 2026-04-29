/*Q1. Write a Java program to find the maximum & minimum element in an integer array.
Time Complexity Explanation :-
We traverse the array once.
Time Complexity: O(n)
Example :	Array = {3, 7, 2, 9, 4}
 		Maximum = 9 , Minimum = 2
*/
import java.util.*;
public class Q1{
	public static void main(String args[]){
		int a[]={3,7,2,9,4};
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++){
			if (a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
		}
			System.out.println("max is="+max);
			System.out.println("min is="+min);
		
		
	}
}