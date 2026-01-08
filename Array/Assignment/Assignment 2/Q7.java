/*Q7.Write a java program to count all pairs of elements in an array whose sum is equal to a given number.
	Input :- arr = [1, 5, 7, -1, 5]        sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3
*/
import java.util.*;
public class Q7{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter the array element:");
		for (int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Araay is:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		//logic 
		int count=0;
		int target=6;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==target){
					count++;
				}
			}
		}
		System.out.println("Total pairs"+count);
	}
}
		
		