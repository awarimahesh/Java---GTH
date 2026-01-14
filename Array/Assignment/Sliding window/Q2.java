/*Q2.  Write a java program to Print sum of every subarray of size K.
Input:
 arr = {1, 2, 3, 4, 5}
 K = 2
Output:
 3 5 7 9
Explanation:
{1,2} → 3
{2,3} → 5
{3,4} → 7
{4,5} → 9
*/
import java.util.*;
public class Q2{
	public static void main(String args[]){
		int a[]={1,2,3,4,5};
		int k=2;
		
		for(int i=0;i<=a.length-k;i++){
			int sum=0;
			for(int j=i;j<k+i;j++){
				sum+=a[j];
			}
			System.out.println(""+sum);
		}
	}
}