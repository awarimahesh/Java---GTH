package test;
import java.util.*;
import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {

        // Take input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int n = sc.nextInt();

        boolean flag = false;   

        System.out.println("Kaprekar Numbers are:");

        // Check every number
        for (int i = 1; i <= n; i++) {
            // Find square
            int square = i * i;

            // Count digits in square
            int temp = square;
            int digit = 0;

            while (temp > 0) {
                digit++;
                temp = temp / 10;
            }

            int power = 1;

            // Split square into two parts
            for (int j = 1; j < digit; j++) {

                power = power * 10;

                int left = square / power;
                int right = square % power;
                // Check Kaprekar condition
                if ((left + right) == i && right != 0) {

                    System.out.print(i + " ");

                    // Check if entered number is Kaprekar
                    if (i == n) {
                        flag = true;
                    }

                    break;
                }
            }

            // 1 is also a Kaprekar number
            if (i == 1) {
                System.out.print("1 ");

                if (n == 1) {
                    flag = true;
                }
            }
        }

        // Print result
        if (flag)
            System.out.println(" is a Kaprekar Number.");
        else
            System.out.println(" is Not a Kaprekar Number.");

        
    }
}