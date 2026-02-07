/*Example: WAP to create a function name as sort() and perform sorting of integer array and character array.
*/
import java.util.*;
public class Q2{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		int arr[]=new int[]{1,4,7,3,7};
		char ch[]=new char[]{'B','F','A','T','Z'};
		
		System.out.println("Arry befor sorting:");
		for(int i=0;i<arr.length;i++){
			System.out.println(""+arr[i]);
		}
		sort(arr);
		System.out.println("Before Sorting charcter arry:");
		for(int i=0;i<ch.length;i++){
			System.out.println(""+ch[i]);
			
		}
		sort(ch);
		
		
	}
	public static void sort(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=(i+1);j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After integer arry sort:");
		for(int i=0;i<arr.length;i++){
			System.out.println(""+arr[i]);
		}
	}
	public static void sort(char ch[]){
		for(int i=0;i<ch.length;i++){
			for(int j=(i+1);j<ch.length;j++){
				if(ch[i]>ch[j]){
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					}
			}
		}
		System.out.println("After soring charcter arry:");
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
	}
}