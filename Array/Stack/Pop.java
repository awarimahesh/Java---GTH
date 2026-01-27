/*
pop
*/
import java.util.*;
public class Pop{
	static int stack[]={10,20,30,40};
	static int top=stack.length-1;
	
	public static void main(String args[]){
	
	if(top==-1){
		System.out.println("Stack is underflow:");
	}
	else{
		int value=stack[top];
		top=top-1;
		System.out.println("poped elsement is:"+value);
		
	}
	System.out.println("Remaning stack is:");
	for(int i=top;i>=0;i--){
		System.out.println(stack[i]);
	}
}
}