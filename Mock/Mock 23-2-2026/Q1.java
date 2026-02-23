/*
Q1. Write a java program to find the frequency of each digit
in a given integer number (user input).
*/
import java.util.Scanner;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);// Take number from user
        System.out.print("Enter number: ");
        int num = sc.nextInt();      // Frequency array for digits 0 to 9
        int[] freq = new int[10];
        // Convert negative number to positive
        if (num < 0) {
            num = -num;
        }
        // Extract digits and count frequency
        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num = num / 10;
        }
        // Print digit frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}