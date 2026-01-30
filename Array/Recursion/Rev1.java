/*Rev*/
import java.util.*;
public class Rev{
	static int rev=0;
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int no=sc.nextInt();
	
	int result=getRev(no);
	System.out.println("the number is"+result);
	
	}
	public static int getRev(int no){
	if(no!=0){
		int rem=no%10;
		no=no/10;
		rev=rev*10+rem;
		return getRev(no);
		
		
	}
	else{
	return rev;
	}
	}
}