/*table*/
import java.util.*;
class TableRe{
	static int count=1;
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number:");
		int no=sc.nextInt();
		
		table(no);
		
		
	}
	public static void table(int no){
		
		if(count<=10){
			System.out.println("count is"+count * no);
			count++;
		}
	}
}