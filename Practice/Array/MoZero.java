/*
 WAP to move zero all end in array 
*/
import java.util.*;
public class MoZero{
	public static void main(String args[]){
	
	int a[]={0,0,1,2,3,0,5,6,0};
	System.out.println("Arry is:");
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	
	
	System.out.println("Move zero in last");
	int count=0;
	/*for(int i=2;i<a.length;i++){
		System.out.println(a[i]);
	}
	for(int j=0;j<2;j++){
		System.out.println(a[j]);
	}*/
	
	for(int i=0;i<a.length;i++){
		
		if(a[i]!=0){
			System.out.println(""+a[i]);
		}
		else{
			count++;
		}
		
	}
	for(int i=0;i<count;i++){
		System.out.println("0");
	}
}
}