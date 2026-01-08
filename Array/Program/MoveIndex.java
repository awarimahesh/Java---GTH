/*
 WAP to create an array of size 6 and store  5 values in it at initial level  and store value on specified index in array and move index by 1.


*/
import java.util.Scanner;
	class MoveIndex{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int a[]=new int [6];
			System.out.println("Enter the arry value :");
			for(int i=0;i<(a.length-1);i++){   //i<5
				a[i]=sc.nextInt();
			}
			
			System.out.println("enter the index and value:");
			int index=sc.nextInt();
			int value =sc.nextInt();
			
			for(int i=4;i>=index;i--){  //for (int i=(a.length-2);i>=index;i--)
				a[i+1]=a[i];
			}
			a[index]=value;
			
			System.out.println("final array is:");
			for(int i =0;i<a.length;i++){
			System.out.println(""+a[i]);
		}
	}
	}