/*Q4. Separate Even and Odd Numbers
Problem Statement
Rearrange an array so that all even numbers come first and odd numbers later.
Two Pointer Explanation
The left pointer finds an odd number.


The right pointer finds an even number.


Swap them.
Continue until pointers cross.


Logical Operations Used
Modulus operator


Conditional swapping
Pointer movement
*/
import java.util.*;
class Q4{
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6};
		
		int i=0;
		int j=a.length-1;
		
		while(i<j){
			while(i<j && a[i]%2==0){
				i++;
			}
			while(i<j && a[j]%2!=0){
				j--;
			}
			if(i<j){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}
}