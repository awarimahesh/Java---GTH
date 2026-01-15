/*Q3. Write a java program to count how many subarrays of size K have sum divisible by 3.
Explanation:
Maintain window sum
Check sum % 3 == 0 for each window


Input :- arr = [3, 6, 2, 4, 7]	K = 2
Output :- 2
*/
import java.util.*;
public class Q8{
	public static void main(String args[]){
		int a[]={3,6,2,4,7};
		int k=2;
		
		
		int count=0;
		for(int i=0;i<=a.length-k;i++){
			int sum=0;
			for(int j=i;j<k+i;j++){
				sum=sum+a[j];
				
			}
			if(sum%3==0){
				count++;
			}
			
		}
		System.out.println(" "+count);
	}
}