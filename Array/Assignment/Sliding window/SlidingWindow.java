/*
Sliding Window:
*/
import java.util.*;
public class SlidingWindow{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int[5];
		System.out.println("Enter arry element");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array is:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		int target=3,k=2,count=0;
		System.out.println("Window count sum Equal to target is:");
		for(int i=0;i<=a.length-k;i++){
			int sum=0;
			for(int j=i;j<(k+i);j++){
				sum=sum+a[j];
			}
			if(sum==target){
				count++;
			}
		}
		System.out.println(count);
	}
}