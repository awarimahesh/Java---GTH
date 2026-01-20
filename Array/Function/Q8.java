/*
Example: WAP to create function int getMax(int arr[]): this function accepts an array as parameter and finds max value from array and returns its max value.

*/
import java.util.*;
public class Q8{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter arry element:");
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
			int maxValue=getMax(a);
			System.out.println("max value is:"+maxValue);
		}
			public static int getMax(int m[])
		{		
			int max=m[0];
			for(int i=0;i<m.length;i++){
			if(m[i]>max){
			max=m[i];
		}
		}
	
		return max;
}
	
}