/*
Question 4: Write a Java program to demonstrate thread sleep() method.

Create a thread that prints numbers from 1–5 with 1 second delay between each number using sleep() method.
Input:
No input required

Output:
1
(wait 1 sec)
2
(wait 1 sec)
3
(wait 1 sec)
4
(wait 1 sec)
5

Explanation:
Thread.sleep() pauses current thread execution for specified milliseconds.
 Wrap in try-catch to handle InterruptedException. Sleep does not release locks held
 by thread. After sleep duration expires, thread resumes execution. Useful for controlled 
 delays and timing in applications.
*/

import java.util.*;
class SleepThread extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(i);
			
		
		try{
			Thread.sleep(1000);
					}
		catch(Exception e){
			System.out.println(e);
			}
		
		}
	}
}
public class Q4{
public static void main(String args[]){
	
	SleepThread st = new SleepThread();
	st.start();
	}
}	