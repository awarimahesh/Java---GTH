/*
Selection sort
*/
import java.util.*;
public class SelsectionSort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int[]{1,3,6,9,5,10};
		
		System.out.println("Unsorted arry is:");
		for(int i=0;i<a.length;i++){
			System.out.println(""+a[i]);
		}
		
		for(int i=0;i<a.length-1;i++){
			int current=i;
			for(int j=i+1;j<a.length;j++){
				if(a[current]>a[j]){
					current=j;
				}
			}
					int temp=a[current];
					a[current]=a[i];
					a[i]=temp;
				
			
		}
		System.out.println("Sorted ary is:");
		for(int i=0;i<a.length;i++){
		System.out.println(""+a[i]);
		}
	}
}