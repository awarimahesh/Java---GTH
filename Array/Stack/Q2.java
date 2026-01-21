/*Q2*/
import java.util.*;
public class Q2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int stack[]=new int[5];
		System.out.println("Enter value:");
		for(int i=0;i<5;i++){
			stack[i]=sc.nextInt();
		}
		System.out.println("Stack is:");
		for(int i=0;i<5;i++){
			System.out.println(stack[i]);
		}
	}
}