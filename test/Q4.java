
/*Q4. Write a program to enter the String and sum of the all Digits in a given String 
   input : abcd123pqe12mn12abc 
   output is  Sum is  147 
   (note  sum of number is 123+12+12 =147)*/
package test;
import java.util.*;
public class Q4 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		// Enter the string
        System.out.print("Enter String:");
        String str = sc.nextLine();
        int sum = 0;
        int num = 0;
        // Check each character
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            // If character is a digit
            if (chr >= '0' && chr <= '9') {

                num = num * 10 + (chr - '0');
            }
            // If character is not a digit
            else {

                sum = sum + num;
                num = 0;
            }
        }
        // Add last number
        sum = sum + num;

        System.out.println("Sum is " + sum);

		
		
		
		
	}

}
