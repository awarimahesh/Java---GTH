/*
WAP to remove duplicate values from array

*/
import java.util.*;
public class DuplicateRemove{
public static void main(String[] args){
	
	int a[]={1,3,1,2,3,4};
	
	Arrays.sort(a);
	
	System.out.println("Sorted ary is:");
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	
	System.out.println("Duplicate remove:");
	System.out.println(a[0]);
	for(int i=1;i<a.length;i++){
		if(a[i]!=a[i-1]){
		System.out.println(a[i]);
		}
	}
	}
}