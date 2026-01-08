/*Q6. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.
*/
import java.util.*;
public class Q6{
	public static void main(String args[]){
	int a[]={0,1,0,3,12};
	int pos=2;
	int n=a.length;
		
	System.out.println("Array is:");
	for (int i=0;i<n;i++){
		System.out.println(a[i]);
	}
	Arrays.sort(a);
	
	System.out.println("Sort array:");
	for(int i=0;i<n;i++){
		System.out.println(a[i]);
		
		
	}
	System.out.println("After  Zero shift:");
	for(int i=pos;i<n;i++){
		System.out.println(a[i]);
		
	}
	
	for(int i=0;i<pos;i++){
		System.out.println(a[i]);
	}

	
	}
}