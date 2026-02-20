/*SlidingWindo optimal solution*/
import java.util.*;
public class SlidingWindoOptimal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int[]{1,2,3,2,1};
		
		System.out.println("Arry is:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		System.out.println("Main logic:");
		
		int target=3,k=2,count=0,sum=0;
		for(int i=0;i<k;i++){
			sum=sum+a[i];
		
			if(sum==target){
				count++;
			}
		}
		
			for(int i=k;i<a.length;i++){
				sum=sum+a[i]-a[i-k];
			
				if(sum==target){
					count++;
				}
			}
				System.out.println("Target window is:"+count);
	}
}