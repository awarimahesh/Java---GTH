import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 11 == 0)
            System.out.println("Divisible by both 5 and 11");
        else
            System.out.println("Not divisible by 5 and 11");
        sc.close();
    }
}