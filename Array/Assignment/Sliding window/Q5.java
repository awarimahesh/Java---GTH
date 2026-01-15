/*Q5. Write a java program to count how many subarrays of size K have sum greater than X.
Input:
 arr = {2, 1, 5, 1, 3, 2}
 K = 3, X = 7
Output:
 2
Explanation:
{2,1,5} → 8 
{1,5,1} → 7 
{5,1,3} → 9 
{1,3,2} → 6 
Total = 2
*/
import java.util.*;
public class Q5{
	public static void main (String args[]){
		int a[]={2,1,5,1,3,2};
		
		int k=3;
		int x=7;
		
		int count =0;
		for(int i=0;i<=a.length-k;i++){
			int sum=0;
			for(int j=i;j<k+i;j++){
				sum+=a[j];
				
			}
			if(sum>x){
				count++;
			
			}
		}
			System.out.println(""+count);
		
	}
}