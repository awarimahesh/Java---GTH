/*
7 4 6 2
Bubble Sort
*/
import java.util.*;
public class BubbleSort{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter arry Size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		
		System.out.println("Unsorted Ary:");
		for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
		}
		
		System.out.println();
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		
		}
			for(int i=0;i<a.length;i++){
			System.out.println("Sorted arry is:"+a[i]);
			}
			
		}
	}
