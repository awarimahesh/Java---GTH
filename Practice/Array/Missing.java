/*
missing element
*/
import java.util.*;
class Missing{
	public static void main(String args[]){
	
	int a[]=new int[]{1,4,2,6,7,9};
	
	System.out.println("Arry befor sorting");
	for(int i=0;i<a.length;i++){
		System.out.println(""+a[i]);
	}
	Arrays.sort(a);
	
	System.out.println("Array after sorting:");
	for(int i=0;i<a.length;i++){
		System.out.println(""+a[i]);
	}
	
	//main logic 1 2 4 6 7 9
	
	System.out.println("Missing value:");
	for(int i=1;i<a.length;i++){
		
		int diff=a[i]-a[i-1];
		if(diff>1){
			int temp=a[i-1];
			while(temp<(a[i]-1)){
				System.out.println(++temp);
				
			}
		}
		
		
		
		/*for(int j=a[i-1];j<(a[i]-1);){
			System.out.println(++j);
		}*/
	}
	
	}
}