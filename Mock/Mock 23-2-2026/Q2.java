/*
Q2. Write a java program to display 1 to nth Strong Number.
*/
import java.util.Scanner;
class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;   // Store original number
        int sum = 0;      // To store sum of factorial of digits   
        while (temp > 0) {
            int digit = temp % 10;   
            // Find factorial of digit
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            // Add factorial to sum
            sum = sum + fact;
            // Remove last digit
            temp = temp / 10;
        }
        // Check Strong Number condition
        if (sum == num) {
            System.out.println(num + " Strong Number");
        } else {
            System.out.println(num + "  NOT a Strong Number");
        }
    }
}