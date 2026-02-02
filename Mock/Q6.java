import java.util.*;
public class Q6 {

    public static void main(String[] args) {

       
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter values in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        
        Arrays.sort(arr);

       
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] );
        }

        // Step 5: Find missing elements
        System.out.println("\nMissing elements:");
        for (int i = 1; i < arr.length; i++) {

            int previous = arr[i - 1];
            int current = arr[i];

            for (int j = previous + 1; j < current; j++) {
                System.out.println(""+j);
            }
        }
    }
}
