import java.util.Scanner;

class SumArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a[];   // array declaration

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        a = new int[size];   

        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;   

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        System.out.println("Sum of array elements = " + sum);
    }
}
