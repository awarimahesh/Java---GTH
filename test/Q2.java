/*Q2. Write a Java program to find all unique triplets whose sum is equal to zero. 
Explanation 
1. Sort array.  
2. Fix one element.  
3. Use two pointers.  
4. Avoid duplicate triplets. 
 
Input : [-1,0,1,2,-1,-4] 
Output : -1 -1 2  ,  -1 0 1*/
package test;
import java.util.*;
public class Q2 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	// Enter array size
    System.out.println("Enter size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    
 // Enter array elements
    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    // Sort the array
    Arrays.sort(arr);

    System.out.println("Triplets are:");

    // Select one element
    for(int i=0;i<n-2;i++) {
    	if(i>0&& arr[i]==arr[i-1])
    		continue;
    	int left =i+1;
    	int right=n-1;
    	
            }
        }
    }
}
}
