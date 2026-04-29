
import java.util.*;
	class StaticArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[];
		
		System.out.println("Arry size is:");
		int size=sc.nextInt();
		
		a=new int[size];
		
		System.out.println("Enter the element:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array is :");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		int max=a[0];
		for(int i=1;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		System.out.println("max"+max);
	}
	}