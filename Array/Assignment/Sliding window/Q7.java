/*Q2.Find the minimum length of a subarray whose sum is greater than or equal to K.
Explanation:
Expand window until sum ≥ K
Shrink from left to minimize window size


Input :- arr = [2, 3, 1, 2, 4, 3]	K = 7
Output :-  2
*/
import java.util.*;
class Q7{
	public static void main(String args[]){
		int a[]={2,3,1};
		int minLength=Integer.MAX_VALUE;
		int left=0;
		int k=2;
		int sum=0;
	
		for(int right=0;right<a.length;right++){
			sum=sum+a[right];
			
			while(sum>=k){
				int length=right-left+1;
				if(length<minLength){
					minLength=length;
				}
				sum=sum-a[left];
				left++;
			
				}
			}
			System.out.println(" "+minLength);
		}
	}
	
