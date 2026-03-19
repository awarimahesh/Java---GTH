/*

TCS

123
*/
import java.util.*;
public class Rev{
	public static void main(String args[]){
		
		int no=7891,rev=0;
		while(no>0){
			rev=rev*10+no%10;
			no=no/10;
		}
		System.out.println(rev);
	}
}