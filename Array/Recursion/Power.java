/*
WAP to input two values consider first as base and second as index and calculate its power using a recursion
*/
import java.util.*;
class Power{
	static int p=1;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the base value:");
		int base=sc.nextInt();
		
		System.out.println("enter the index value:");
		int index=sc.nextInt();
		power(base,index);
	
	}
	public static void power(int b,int ind){
		if(ind!=0){
			p=p*b;
			ind--;
			power(b,ind);
		}
		else{
			System.out.println("power is:"+p);
		}
		
		
		
		}
	}
