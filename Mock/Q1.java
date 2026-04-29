/*Q1. Write a java program to Check Number Is Armstrong Number or Not. */
import java.util.Scanner;
class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.println("enter The number:");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}

