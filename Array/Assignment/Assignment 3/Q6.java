/*Q6. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.
*/
import java.util.*;
public class Q6{
	public static void main(String args[]){
		
		int a[]={2,4,6,8};
		
		System.out.println("Array:");
		for (int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		int index=0;
		
		int sqer[]=new int[a.length];
		
		System.out.println();
		
		for(int i=0;i<a.length;i++){
			sqer[index]=(a[i]*a[i]);
			index++;
			
		}
		
		System.out.println("new array:");
		for(int i=0;i<a.length;i++){
			System.out.println(sqer[i]);
		}
	}
}