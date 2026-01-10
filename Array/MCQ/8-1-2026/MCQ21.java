import java.util.*;
public class MCQ21{
	public static void main(String args[]){
		int[] a = {10,20,30};
		int x = a[1];
		a[1] = a[2];
		a[2] = x;
		System.out.print(a[1]+" "+a[2]);

	}
}