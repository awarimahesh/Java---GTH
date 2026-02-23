/*
Q6. Write a java program to find the union and intersection
of two unsorted arrays using user input.
*/
import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        // Input size of first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
		
		
        // Input elements of first array
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
		
        // Input size of second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
		
		
        // Input elements of second array
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
		
        // Array to store union
        int[] union = new int[n1 + n2];
        int u = 0;
		
		
        // Add all elements  first array to union
        for (int i = 0; i < n1; i++) {
            union[u++] = arr1[i];
        }
        // Add elements of second array if not already present
        for (int i = 0; i < n2; i++) {
            boolean found = false;
            for (int j = 0; j < n1; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                union[u++] = arr2[i];
            }
        }

        // Print Union
        System.out.print("Union: ");
        for (int i = 0; i < u; i++) {
			
            System.out.print(union[i] + " ");
        }

        // Print Intersection
        System.out.print("\nIntersection: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}