/*
Selection sort
*/

import java.util.*;
class Selection{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[]=new int[5];
		
		System.out.println("Enter array elemnt:");
		for(int i=0;i<arr.length;i++){
		 arr[i]=sc.nextInt();
		}
		
		System.out.println("unsorted arry is:");
		for(int i=0;i<arr.length;i++){
			System.out.println(""+arr[i]);
		}
		
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++){
			for(int j=(i+1);j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		System.out.println(""+arr[i]);
		}
}
}