/*

Create a thread and change its name using setName(). Display the thread name using getName().
Input:
Enter thread name: WorkerThread

Output:
Thread name is: WorkerThread

Explanation:
Every thread has default name like "Thread-0", "Thread-1". Use setName() to assign custom 
name for identification. Use getName() to retrieve current thread name. Custom names help in 
	debugging and monitoring threads. Useful for logging and tracking
 thread behavior in applications.*/
import java.util.*;
class MyThread extends Thread{
	public void run(){
		
		System.out.println("Thread name is:  "+getName());
		
	}
}
public class Q5{
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Thread name: ");
			String name = sc.nextLine();
			
			MyThread mt = new MyThread();
			mt.setName(name);
			
			mt.start();
			
		}
	}
