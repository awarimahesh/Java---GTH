/*How can we access the base address of the array?
*/
import java.util.*;
public class Q6{
	public static void main(String args[]){
		
		int a[]=new int[]{10,20,30,40};
		System.out.println("base adress is:"+System.identityHashCode(a));
		show (a);
	}
	
	public static void show(int m[]){
		System.out.println("base adress is :"+System.identityHashCode(m));
	}
}