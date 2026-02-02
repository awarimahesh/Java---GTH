import java.util.Scanner;
class StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n numbers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {//cheak number
            int num = i;
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
				//factorial logic
				
                int fact = 1;
                for (int j = 1; j <= digit; j++) {
                    fact = fact * j;
                }
				//factrial sum
                sum = sum + fact;
                num = num / 10;//remove last digit
            }
            if (sum == i) {
                System.out.println(""+i);
            }
			
        }
    }
}
