/*Q2. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]


Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.
*/

import java.util.*;

public class Q2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array is:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        a[0] = 0;
        a[a.length - 1] = 0;

        System.out.println("Final array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
