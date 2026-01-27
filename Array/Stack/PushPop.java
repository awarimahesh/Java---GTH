/*
push + pop
*/
import java.util.*;
public class PushPop{
	static int stack[]=new int[5];
	static int top=-1;
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		
		 do{
			 System.out.println("1:push");
			 
			 System.out.println("2:pop");
			 
			 System.out.println("3:Display");
			 System.out.println("4:exit");
			 System.out.println("Enter your choise:");
			 int choice=sc.nextInt();
				switch(choice){
					case 1:
					System.out.println("Push elemnt in stack:");
					int value=sc.nextInt();
					push(value);
					break;
					
					case 2:
					if(top!=-1){
					System.out.println("poped element is:"+pop());
					}
					else{
						System.out.println("Stack is under flow:");
					}
					break;
					
					
					case 3:
					display();
					break;
					
					case 4:
					System.exit(0);
					break;
					
					default:
					System.out.println("wrong choice:");
				
		 }
	}
	while(true);
}
	public static void push(int value){
	if(top==(stack.length-1)){
		System.out.println("Stack is ovwr flow:");
	}
	else{
		top=top+1;
		stack[top]=value;
		}
		
	}
	public static int pop(){
	if(top==-1){
		return top;
	}
	else{
		int value=stack[top];
		top=top-1;
		return value;
	}
	}
	public static void display(){
		if(top==-1){
			System.out.println("top is under flow:");
		}
		else{
			System.out.println("Stack is:");
			for(int i=top;i>=0;i--){
				System.out.println(stack[i]);
			}
		}
	}

}