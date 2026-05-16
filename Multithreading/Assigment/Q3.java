/*
Question 3: Write a Java program to create two threads 
where one prints numbers and another prints alphabets.

Create two separate threads. The first thread prints numbers from 
1–5 and the second thread prints characters from A–E.
Input:
No input required

Output:
Numbers Thread: 1 2 3 4 5
Alphabet Thread: A B C D E

Explanation:
Multiple threads execute concurrently, allowing parallel execution 
of different tasks. Create separate Runnable implementations for each task
 and start multiple Thread objects. Both threads execute independently and may 
 interleave their output due to scheduling. Demonstrates concurrent execution of 
 independent operations.




*/
import java.util.*;
class NumberThread implements Runnable{
	public synchronized void run(){
		for(int i=1;i<=5;i++){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
		
		System.out.println();
	}
}
class AlphabetsThread implements Runnable{
	public synchronized  void run(){
		
		for(char ch='A';ch<='E';ch++){
			System.out.println(ch);
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
		System.out.println();
	}
}
public class Q3{
public static void main(String args[]){
	
	NumberThread nt = new NumberThread();
	
	Thread t1=new Thread(nt);
	
	t1.start();
	try{
	t1.join();
	}
	catch(Exception e){
		System.out.println(e);
	}
	AlphabetsThread at = new AlphabetsThread();
	Thread t2 = new Thread(at);
	t2.start();
}
}

