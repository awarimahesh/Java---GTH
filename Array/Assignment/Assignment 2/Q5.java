/*Q5. Write a Java program to sort a given array in ascending & descending order.

	 Input : 	Array = [12, 5, 9, 34, 1]
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
Descending Order: [34, 12, 9, 5, 1]
*/
import java.util.*;
public class Q5{
	public static void main (String args[]){
	int a[]={12,5,9,34,1};
	
	System.out.println("Array is:");
	for (int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	Arrays.sort(a);
	System.out.println("Sort arry ascending Array:");
	for (int i=0;i<a.length;i++){
		System.out.println(" "+a[i]);
	}
	
	System.out.println("Desending order array:");
	for(int i=a.length-1;i>=0;i--){
		System.out.println(a[i]);
	}
	}
}