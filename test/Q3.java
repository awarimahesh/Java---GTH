git/*Q3. Write a Java program to design queue using array and reverse elements without extra data 
structure. 
Explanation  
• Continue till middle. 
Input :10 20 30 
Output : 30 20 10*/
package test;
import java.util.*;
public class Q3 {
public static void main(String args[]) {

	 Scanner sc = new Scanner(System.in);
     // Enter queue size
     System.out.print("Enter digit size: ");
     int n = sc.nextInt();

     int digit[] = new int[n];

     // Enter digit elements3
     System.out.println("Enter  digit:");
     for (int i = 0; i < n; i++) {
         digit[i] = sc.nextInt();
     }

     // Reverse  using swapping
     int start = 0;
     int end = n - 1;

     while (start < end) {
    	 //swap logic
         int temp = digit[start];
         digit[start] = digit[end];
         digit[end] = temp;

         start++;
         end--;
     }

     // Display reversed digit
     System.out.println("Reversed digit:");

     for (int i = 0; i < n; i++) {
         System.out.print(digit[i] + " ");
     }
	
}
}
