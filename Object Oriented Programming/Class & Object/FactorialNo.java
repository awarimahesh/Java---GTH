/*
Example:WAP to create class name as Factorial with two functions 

*/
import java.util.*;
class Factorial{
	int no;
	void setvalue(int x){
		no=x;
	}
	int getFactorial(){
		int f=1;
		for(int i=1;i<=no;i++){
			f=f*i;
			
		}
		return f;
	}
	
}
public class FactorialNO{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number is:");
		int no=sc.nextInt();
		
		Factorial f=new Factorial();
		f.setvalue(no);
		int result=f.getFactorial();
		System.out.println("Factorial is :"+result);
		
	}
	
}