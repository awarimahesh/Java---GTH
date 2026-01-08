/*Q8. Write a java program to find union array of two unsorted array.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique elements.
*/
import java.util.*;
public class Q8{
	public static void main(String args[]){
		
		int a1[]={1,2,3};
		int a2[]={2,3,4,5};
		
		for (int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		
		for(int i=0;i<a2.length;i++){
			boolean found=false;
			
			for(int j=0;j<a1.length;j++){
				if(a2[i]==a1[j]){
					found=true;
					break;
				}
			}
			if(!found){
				System.out.println(a2[i]);
			}
		}
	}
}