/*
find the occurrence of element

10,20,30,20,20,30,10,40;
*/
import java.util.*;
	class Occurrance{
		public static void main(String args[]){
		
		int arr[]={10,20,30,20,20,30,10,40};
		
		System.out.println("The arry is");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("Array occurance below:");
		for(int i=0;i<arr.length;i++){
			int count=0;
			boolean occur=false;
			
		for(int k=0;k<i;k++){
			if(arr[i]==arr[k]){
				occur=true;
				break;
			}
		}
		if(occur){
			continue;
		}
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			System.out.println(arr[i]+"->"+count);
		}
	}
			
}