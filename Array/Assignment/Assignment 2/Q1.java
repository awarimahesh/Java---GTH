/*Q1. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
*/
import java.util.*;
public class Q1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[7];
		
		System.out.println("Enter array element:");
		for(int i =0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array:");
		for(int i =0;i<a.length;i++){
			System.out.println(" "+a[i]);
			
		}
		Arrays.sort(a);
		
		int count=1;
		for(int i=1;i<a.length;i++){
			if(a[i]==a[i-1]){
				count++;
				
			}
			else{
				System.out.println(a[i-1]+" ->"+ count);
				count=1;
			}
		}
	System.out.println(a[a.length-1]+" "+ count);
	}
}