/*Sliding Window Practice Program :-

Q1. Write a java program to Check if any subarray of size K has sum equal to Target.
Input:
arr = {1, 4, 2, 10, 23, 3, 1, 0, 20}
K = 4, Target = 39
Output:
Yes
Explanation:
Window {4,2,10,23} → sum = 39
*/
import java.util.*;
public class Q1{
	public static void main(String args[]){
		
		int a[]={1,4,2,10,23,3,1,0,20};
		
		int k=4;
		int target=39;
		boolean found=false;
		for (int i=0;i<=a.length-k;i++){
			int sum=0;
			for(int j=i;j<i+k;j++){
				sum+=a[j];
				}
			if(sum==target){
				found=true;
				break;
			}
		}
		if(found){
			System.out.println("yes :");
		}
		else{
			System.out.println("no");
		}
	}
}