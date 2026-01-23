import java.util.*;

public class Q2 {
    static int top = -1;
    static int stack[] = new int[5];

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int value = sc.nextInt();
                    push(value);
                    break;

                case 2:
                    if (top != -1) {
                        System.out.println("Removed element: " + pop());
                    } else {
                        System.out.println("Stack is underflow");
                    }
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public static void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    public static int pop() {
        int value = stack[top];
        top--;
        return value;
    }

    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
