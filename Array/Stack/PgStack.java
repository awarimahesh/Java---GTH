/*Q1. Previous Greater Element?
The previous greater element is the closet greater element on the left side and if previous element is greater then replace with next element otherwise replace with -1
*/
import java.util.*;
	class PgStack{
		public static void main(String args[]){
			Scanner sc =new Scanner(System.in);
			
			int arr[]=new int[4];
			int result[]=new int[arr.length];
			int stack[]=new int[arr.length];
			
			System.out.println("Enter element:");
			for(int i=0;i<arr.length;i++){
				arr[i]=sc.nextInt();
				
			}
			System.out.println("Origanl arry is:");
			for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			}
				int top=-1;
				for(int i=0;i<arr.length;i++){
					while(top>=0 && stack[top]<=arr[i]){
						top--;
					}
					result[i]=(top==-1)?-1:stack[top];
					stack[++top]=arr[i];
				}
				System.out.println("resultant arry:");
				for(int i=0;i<result.length;i++){
					System.out.println(result[i]);
				}
			
			
			
			
		}
	}