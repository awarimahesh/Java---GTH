/*
 Q2. Simple Calculator
Write a program that accepts two numbers and an operator ('+', '-', '', '/') and performs the corresponding arithmetic operation using a 'switch' statement.


*/
/*
Q2. Simple Calculator
Write a program that accepts two numbers and an operator ('+', '-', '*', '/') 
and performs the corresponding arithmetic operation using a 'switch' statement.
*/
import java.util.Scanner;
class Q02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        
        System.out.println("Enter operator (+, -, *, /):");
        char ch = sc.next().charAt(0);

        switch(ch) {
            case '+': 
                System.out.println("Result: " + (num1 + num2)); 
                break;
            case '-': 
                System.out.println("Result: " + (num1 - num2)); 
                break;
            case '*': 
                System.out.println("Result: " + (num1 * num2)); 
                break;
            case '/': 
                if(num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Error: Division by zero not allowed.");
                break;
            default: 
                System.out.println("Invalid operator! Please enter +, -, *, or /.");
        }
    }
}
