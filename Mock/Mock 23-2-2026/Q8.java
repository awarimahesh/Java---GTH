/*
Write a java program to take input array from user and
store only prime digits at the same index of digit.
*/
import java.util.*;
class Q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		System.out.println("Array is:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
		System.out.println();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int result = 0;
            int place = 1;

            // Extract digits
            while (num > 0) {
                int digit = num % 10;

                // Check prime digit (2,3,5,7)
                if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                    result = digit * place + result;
                    place = place * 10;
                }
                num = num / 10;//remove no
            }
            System.out.print(result + " ");
        }
    }
}