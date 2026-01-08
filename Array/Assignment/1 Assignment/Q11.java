/*Q11. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/
import java.util.*;
	class Q11{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Array is");
			int a[]={12,13,1,10,34,1};
			for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			}
			Arrays.sort(a);
			System.out.println("Second largest element is:"+a[a.length-2]);
		}
	}