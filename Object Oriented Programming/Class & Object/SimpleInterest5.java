/*
5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that
 computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.
Simple Interest (SI)=P×R×T/100
*/
import java.util.*;
class SimpleInterest{
	int calculate(int P,int R,int T){
		int SI=(P*R*T)/100;
		return SI;
	}
}
public class SimpleInterest5{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENter principle amount:");
	int P=sc.nextInt();
	
	System.out.println("Enter rate of intrest:");
	int R=sc.nextInt();
	
	System.out.println("Enter Time:");
	int T=sc.nextInt();
	
	SimpleInterest sim=new SimpleInterest();
	int result=sim.calculate(P,R,T);
	System.out.println("Simple intrest:"+result);
	}
}