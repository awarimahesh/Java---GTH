import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int a[] = new int[size];
        int b[] = new int[size];

        System.out.println("Enter Array A elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Array B elements:");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Common elements are:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    break; 
                }
            }
        }
    }
}