/* Stack Program */
import java.util.*;

public class Q1 {
    public static void main(String args[]) {

        int MAX = 5;
        int stack[] = new int[MAX];
        int top = -1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Push 3 values:");

        // PUSH operation
        for (int i = 0; i < 3; i++) {

            if (top == MAX - 1) {
                System.out.println("Stack Overflow");
                break;
            } else {
                int value = sc.nextInt();
                top = top + 1;
                stack[top] = value;
            }
        }

        // DISPLAY operation
        System.out.println("Stack elements are:");

        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
