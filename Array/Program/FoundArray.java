/*
Found the array element.
*/

import java.util.Scanner;
class FoundArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a[];
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		a=new int[size];
		
		System.out.println("enter the arry value :");
		for(int i=0;i<a.length;i++){
		
		a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the serach element");
		int skey=sc.nextInt();
		
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==skey){
				flag=true;
				break;
				
			}
		}
		if(flag){
			System.out.println("found");
		}
		else{
			System.out.println("not found:");
		}
	}
}