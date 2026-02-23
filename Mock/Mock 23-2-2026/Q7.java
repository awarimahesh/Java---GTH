/*
Q7. Write a program in java to find the maximum for each and every
contiguous subarray of size k from a given array.
*/
import java.util.Scanner;
class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Take array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Take value of k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        // Print the array
        System.out.println("The given array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // Loop for each subarray
        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];   // assume first element is max
            // Print subarray and find max
			
            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j] + " ");
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            // Print max of current subarray
            System.out.println("----> " + max);
        }
    }
}