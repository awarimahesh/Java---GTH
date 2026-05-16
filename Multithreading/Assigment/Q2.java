/*Question 2: Write a Java program to create a thread using Runnable interface 
and display even numbers.*/

import java.util.*;
class EvenThread implements Runnable{
	
	public void run(){
		
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	public static void main(String args []){
		
		EvenThread et = new EvenThread();
		
		Thread t= new Thread(et);
		t.start();
	}
}