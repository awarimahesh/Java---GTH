/*Example: WAP to create a function name as int getSquare(int no) this function is used for accepting a number as a parameter and calculating its square and returning it.
*/
import java.util.*;
public class Q4{
	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number:");
		int no=sc.nextInt();
		
		int result=getSquare(no);
		System.out.println("Squre is :"+result);
	}
		
		public static int  getSquare(int no)
		{
			return no*no;
		}

}