import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double cost = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double sell = sc.nextDouble();
        
        if (sell > cost)
            System.out.println("Profit = " + (sell - cost));
        else if (sell < cost)
            System.out.println("Loss = " + (cost - sell));
        else
            System.out.println("No Profit No Loss");
        
        sc.close();
    }
}