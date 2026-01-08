// Revers number 1234
import java.util.Scanner;
	public class ReversNumber{
		public static void main(String args[]){
			int no;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number ");
			no=sc.nextInt();
			System.out.println("Before revers number is :"+no);
			
			
			no=(no%10)*1000+((no/10)%10)*100+((no/100)%10)*10+no/1000;
			 System.out.println("After number is revers:"+no);
			 
			 sc.close();
			
			
		}
	}
