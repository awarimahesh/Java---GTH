/*Q2. Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array
*/
import java.util.*;
	class Q2{
		public static void main (String args[]){
			Scanner sc =new Scanner(System.in);
			
			int a[]=new int[8];
			int n=a.length;
			System.out.println("Enter araay element:");
			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			}
			
			System.out.println("Array is:");
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
			Arrays.sort(a);
			
			
			
			
			for(int i=0;i<n;i++){
				int count=0;
				for(int j=0;j<n;j++){
					if(count>n/2){
					}
				}
			System.out.println("Majority element:"+a[i]);
			return;
				}	
			}
	}	
			
		