/*
 Q5. Write a Java program to Create deposit and withdrawal threads using synchronization. 
Explanation 
 

• One thread deposits money.  
• Another withdraws money.  
• Synchronization avoids data inconsistency. 
• Initial Balance = 1000 
Output :- Deposited: 500 
                  Withdrawn: 1200 
                  Remaining Balance: 300
 */
package test;

import java.util.Scanner;
// POJO Class
class Bank {
    // Initial balance
    private int balance = 1000;
    // Deposit method
    public synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }
    // Withdraw method
    public synchronized void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
    }
    // Get method
    public int getBalance() {
        return balance;
    }
}

// Main Class
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create Bank object
        Bank b = new Bank();
        // deposit amount
        System.out.print("Enter Deposit Amount: ");
        int deposit = sc.nextInt();
        // withdraw amount
        System.out.print("Enter Withdraw Amount: ");
        int withdraw = sc.nextInt();
        // Deposit Thread
        Thread t1 = new Thread() {
            public void run() {
                b.deposit(deposit);
            }
        };

        // Withdraw Thread
        Thread t2 = new Thread() {
            public void run() {
                b.withdraw(withdraw);
            }
        };

        // Start threads
        t1.start();
        t2.start();

        // Wait for both threads
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }

        // Display remaining balance
        System.out.println("Remaining Balance: " + b.getBalance());

        sc.close();
    }
}