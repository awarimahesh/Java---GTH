/*
Q7. Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]
Explanation: For each element, calculate factorial using repeated multiplication, and update the array element with this value.
*/
import java.util.*;
public class Q7{
	public static void main(String args[]){
		
		int arr[]={3,4,5};
		
		System.out.println("Array is");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		
		
		int fact=1;
		int num=arr[i];
		
		for(int j=1;j<=num;j++){
			fact=fact*j;
		}
		arr[i]=fact;
		}
		System.out.println("Updated arry is:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}