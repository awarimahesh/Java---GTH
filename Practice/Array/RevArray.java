/*Reverse the value*/
import java.util.*;
public class RevArray{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		int a[]=new int[]{1,2,3,4,5};
		System.out.println("Normal value:");
		for(int i=0;i<a.length;i++){
			System.out.println(""+a[i]);
		}
		
		//main logic
		
		System.out.println("Rev value:");
		int start=0;
		int end=a.length-1;
			while(start<end){
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
		}
		System.out.println();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		}
	}
