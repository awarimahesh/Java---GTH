import java.util.Scanner;

class Remainder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dividend:");
        int dividend = sc.nextInt();

        System.out.println("Enter divisor:");
        int divisor = sc.nextInt();

        int quotient = 0;  
        int temp = dividend;

       
        while (temp >= divisor) {
            temp = temp - divisor;
            quotient++;
        }

        int remainder = temp;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        sc.close();
    }
}
