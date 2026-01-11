/*sliding windo */

import java.util.*;
class SW1{
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter arry Size:");
	int size=sc.nextInt();
	int arr[]=new int[size];
	
	System.out.println("enter array element:");
	for (int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Array is:");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	
	int sum,target=3,k=2,count=0;
	System.out.println("Array equal to target:");
	for(int i=0;i<=arr.length-k;i++){
		 sum=0;
		for(int j=i;j<(k+i);j++){
			sum=sum+arr[j];
			
		}
		if(sum==target){
			count++;
		}
	}
	System.out.println(" "+count);
	
	}
}