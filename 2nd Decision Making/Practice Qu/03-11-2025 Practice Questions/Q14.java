import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        double hra, da;
        
        if (basic <= 10000) {
            hra = basic * 0.20;
            da = basic * 0.80;
        } else if (basic <= 20000) {
            hra = basic * 0.25;
            da = basic * 0.90;
        } else {
            hra = basic * 0.30;
            da = basic * 0.95;
        }
        
        double gross = basic + hra + da;
        System.out.println("Gross Salary = " + gross);
        sc.close();
    }
}