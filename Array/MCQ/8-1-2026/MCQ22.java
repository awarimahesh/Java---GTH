import java.util.*;
public class MCQ22{
	public static void main(String args[]){
		int[] a = {1,2,3,4};
		int p = 1;
		for(int i=0;i<a.length;i++){
			p *= a[i];
		}
		System.out.println(p);

	}
}