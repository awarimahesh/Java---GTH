/*Q13. Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.
*/


import java.util.*;
public class Q13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
        int size = sc.nextInt();

        int a[] = new int[size];
		
		System.out.println("Enter arry element :");
		for (int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			
		}
		System.out.println("array is :");
		for (int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
	}
		System.out.println("non zero element:");
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				System.out.println(a[i]);
			}
		}
	}
}