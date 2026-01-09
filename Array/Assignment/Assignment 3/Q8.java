/*Q8. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements*/

import java.util.*;
public class Q8{
	
	public static void main(String args[]){
		
		int arr[]={2,5,6,9,11};
		
		System.out.println("Array is:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		int primecount=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%arr[i]==0 && arr[i]%1==0){
				primecount++;
			}
		}
		System.out.println("Total prime number is:"+primecount);
	}
}