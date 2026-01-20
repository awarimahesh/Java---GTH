/*5. Check Prime Number

Problem: Write a function that checks whether a number is prime.

Input:
n = 11

Output:
Prime*/
import java.util.*;

class Q5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int no = sc.nextInt();

        prime(no);   // function calling
    }

    public static void prime(int n) {

        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}