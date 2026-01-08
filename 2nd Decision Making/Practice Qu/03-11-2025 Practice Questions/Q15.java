import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int min = (a < b) ? a : b;
        System.out.println("Minimum: " + min);
        sc.close();
    }
}