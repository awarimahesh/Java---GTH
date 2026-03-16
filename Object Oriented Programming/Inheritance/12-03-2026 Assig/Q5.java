	/*
	5) Bank and SavingsAccount
	Create a class Bank with:
	• Method getInterestRate()
	Create a subclass SavingsAccount that:
	• Adds method calculateInterest()
	Task: Calculate interest for given balance.


	*/

import java.util.*;

class Bank{

    public double getInterestRate(){
        return 5.0; // 5% interest
    }

}

class SavingAccount extends Bank{

    private double balance;

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void calculateInterest(){

        double rate = getInterestRate();
        double interest = (balance * rate) / 100;

        System.out.println("Balance is: " + balance);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Interest Amount: " + interest);
    }

}

public class Q5{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount();

        System.out.println("Enter account balance:");
        double balance = sc.nextDouble();

        sa.setBalance(balance);

        sa.calculateInterest();

    }

}