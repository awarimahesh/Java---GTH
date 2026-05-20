// Java Thread Example using Runnable interface

class MyRunnable implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Runnable thread: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj); // create thread
        t1.start(); // start thread
    }
}