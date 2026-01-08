/*Q3. Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:

	12 14 18 20 22 25 27 0 3  6 9
*/
import java.util.*;
	class Q3{
		public static void main(String args[]){
			
		int a[]={0,3,6,9,12,14,18,20,22,25,27};
		int n=a.length;
		int pos=4;
		
		System.out.println("Array is:");
		for (int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		
		System.out.println("forth position asryy:");
		for(int i=pos;i<n;i++){
			System.out.println(""+a[i]);
		}
		
		System.out.println("Before fourt position array:");
		for(int i=0;i<pos;i++){
			System.out.println(a[i]);
		}
		
		System.out.println("After rotating:");
		for(int i=pos;i<n;i++){
			System.out.println(a[i]);
		}
		for(int i=0;i<pos;i++){
			System.out.println(a[i]);
		}
		
		}
	}