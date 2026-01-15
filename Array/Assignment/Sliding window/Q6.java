/*Q1. Given an integer array and a number K, find the length of the longest continuous subarray whose sum is less than or equal to K.
Explanation:
Use two pointers (start, end)
Expand the window by moving end
If sum > K, shrink window from start
Track maximum window length
Input :- arr = [2, 1, 5, 1, 3, 2]		K = 7
Output :- 3
*/

import java.util.*;
class Q6{
	public static void main(String args[]){
		
		int a[]={1,2,1,5,1,3,2};
		int start=0;
	
		
		int k=7;
		int sum=0;
		
		int maxLength=0;
		
		for(int end=0;end<a.length;end++){
			sum=sum+a[end];
			
			while(sum>k){
			sum-=a[start];
				start++;
			}
			int length=end-start+1;
			if(length>maxLength){
				maxLength=length;
			}
			
			
		}
		System.out.println(" "+maxLength);
	
	}
}