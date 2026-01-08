/*Q10. Write a java program to replace all negative numbers in an array with 0.	
	Input :- arr = [2, -3, 4, -1, 5]
	Output :-  [2, 0, 4, 0, 5]
Explanation:
Each negative element is replaced with 0.
Non-negative elements remain unchanged.
*/
import java.util.*;
public class Q10{
	public static void main(String args[]){
	
	int a[]={2,-3,4,-1,5};
	
	System.out.println("Current array:");
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
		
		
	}
	
	for(int i=0;i<a.length;i++){
		if(a[i]<0){
			a[i]=0;
		}
	}
	System.out.println("updated array:");
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	
	
}
}