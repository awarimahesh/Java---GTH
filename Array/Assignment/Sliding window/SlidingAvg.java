/*Sliding Avrage*/
import java.util.*;
public class SlidingAvg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int[]{1,3,6,2,-1,4,1,8,2};
		
		System.out.println("Array is:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		int sum=0,k=5;
		System.out.println("Slid Avrage:");
		for(int i=0;i<k;i++){
			sum=sum+a[i];
		}
		System.out.print(((float)sum/k)+"\t");
		
		
		for(int i=k;i<a.length;i++){
			sum=sum+a[i]-a[i-k];
			System.out.print(((float)sum/k)+"\t");
		}
	}
}