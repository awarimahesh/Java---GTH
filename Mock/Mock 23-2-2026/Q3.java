/*
Q3. Write a java program to check Number Is Prime Number or Not prime using function 
recursion. 
*/
import java.util.Scanner;
public class Q3 {
    // Recursive function 
    boolean prime(int n, int i) {

        // If all numbers are checked, the number is prime
        if (i == n)
            return true;

        // If number is divisible by i, it is not prime
        if (n % i == 0)
            return false;

        // Recursive call with next divisor
        return prime(n, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input from user
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        // Create object of class Q3 // without obj use static keyword.
        Q3 obj = new Q3();
        // Check prime using recursion
        if (n > 1 && obj.prime(n, 2))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}