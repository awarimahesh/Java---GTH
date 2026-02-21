/*
Array as parameter in class function 

*/
import java.util.*;
class sum{
	int s=0;
	void Calsum(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			s=s+arr[i];
		}
		System.out.println("Array Sum Is:"+s);
	}
}
public class ArraySum{
	public static void main(String args[]){
		
		int a[]=new int[]{1,2,3,4,5,6,7};
		sum su=new sum();
		su.Calsum(a);
	}
}