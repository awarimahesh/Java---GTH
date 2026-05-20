/*
Question 1: Write a Java program to create a thread using Thread class 
and display numbers from 1 to 10.
*/
import java.util.*;
class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	}






	public static void main (String args []){
		MyThread mt = new MyThread();
		
		mt.start();
	}
}






















