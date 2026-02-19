/*
Linear serch algorithm

*/
import java.util.*;
public class LinearSearch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter ary element:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println(" array is:");
		for(int i=0;i<a.length;i++){
			System.out.println(""+a[i]);
		}
		System.out.println("Enter search key:");
		int skey=sc.nextInt();
		
		
		int index=-1;
		for(int i=0;i<a.length;i++){
			if(a[i]==skey){
				index=i;
				break;
			}
		}
		if(index!=-1){
			System.out.println("found:");
		}
		else{
		System.out.println("Not found:");
		}
			
		}
	}
