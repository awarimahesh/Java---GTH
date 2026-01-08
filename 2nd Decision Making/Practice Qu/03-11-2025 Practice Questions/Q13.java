import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        if (a == b)
            System.out.println("Both are equal");
        else
            System.out.println("Not equal");
        sc.close();
    }
}