/*
Marge Sort
*/
import java.util.*;
public class MargeSort{
	public static void conquer(int arr[],int si,int mid,int ei){
		int marge[]=new int[ei-si+1];//Merge ke time jitne elements combine honge, utni hi size ka temporary array banana
		int index1=si;
		int index2=mid+1;
		int x=0;//marge arry me elment store 
		while(index1<=mid&&index2<=ei){//condition cheak
			if(arr[index1]<=arr[index2]){
				marge[x]=arr[index1];
				x++;
				index1++;
			}
			else{
				marge[x++]=arr[index2++];
			}
		}
		while(index1<=mid){
		marge[x++]=arr[index1++];

		}
		while(index2<=ei){
		marge[x++]=arr[index2++];

		}
		
		for(int i=0,j=si;i<marge.length;i++,j++){
			arr[j]=marge[i];
		}
		
	}
	public static void divid(int arr[],int si,int ei){
		if(si>=ei){
			return;
		}
		int mid=si+(ei-si)/2;
		divid(arr,si,mid);
		divid(arr,mid+1,ei);
		conquer(arr,si,mid,ei);
	
	}

	

public static void main(String args[]){
	int arr[]=new int[]{7,6,5,4,3,2,1};
	System.out.println("Befor array sorting:");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	
	int n=arr.length;
	
	divid(arr,0,n-1);// initial call
	
	
	System.out.println("After sorting:");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}
	
}


}