/*
marge array
*/
import java.util.*;
class MaArray{
	public static void main(String args[]){
		
		int a[]=new int[]{1,2,3,4,5,6};
		int b[]=new int[]{7,8,9,10,3,6};
		
		int c[]=new int[a.length+b.length];
		
		for(int p=0,n=(a.length);p<a.length;p++,n++){
			c[p]=a[p];
				c[n]=b[p];
		}
		System.out.println("Array a is:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("Array b is:");
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		System.out.println("Array c is:");
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
	}
}