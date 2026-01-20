/*Square*/
import java.util.*;
public class Q2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			int no;
			System.out.println("Enter the number from key board:");
			no=sc.nextInt();
			int result=getSquare(no);
				System.out.println(""+result);
		}
		public static int getSquare(int no){
			return no*no;
		}
		
	}
