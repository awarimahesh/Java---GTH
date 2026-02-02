/*Q7. Write a java program to remove duplicated values from arrays. 
Input : Array = {10, 20, 20, 30, 40, 40, 50} 
Output : Unique elements = {10, 20, 30, 40, 50} */
import java.util.*;
public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        // Step 4: Print unique elements
        System.out.print("Unique elements = ");

        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        // Print last element
        System.out.print(arr[n - 1]);
    }
}
