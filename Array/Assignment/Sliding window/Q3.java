/*Q3. Write a java program to Find the window of size K whose elements have the highest sum.
Input:
 arr = {4, 2, 10, 3, 8, 6}
 K = 2
Output:	14
Explanation:
Window {8,6} → sum = 14
*/
import java.util.*;
public class Q3{
	public static void main(String args[]){
		int k=2;
		int a[]={4,2,10,3,8,6};
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<=a.length-k;i++){
			int sum=0;
			for(int j=i;j<k+i;j++){
				sum+=a[j];
			}
			System.out.println(" "+sum);
		
		if(sum>maxSum){
			maxSum=sum;
		}
	}
		System.out.println("MAximum value "+maxSum);
	}
}