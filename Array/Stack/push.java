/*
Stack PUSH Operation
*/
import java.util.*;
public class push{
	static int top=-1;
	public static void main(String args[]){
		
		int stack[]=new int[5];
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++){
		System.out.println("Enter the element push:");
		int value=sc.nextInt();
		
		if(top==stack.length-1){
			System.out.println("Is overflow:");
			break;
		}
		else{
			top=top+1;
			stack [top]=value;
			
			System.out.println("element push succesfully:");
			}
		}
		System.out.println("Stack element is:");
		for(int i=top;i>=0;i--){
			System.out.println(stack[i]);
		}
	}
}