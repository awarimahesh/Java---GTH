/*
Example: WAP to create class name as InsertionSort with three methods 

void setArray(int arr[]): this function can accept array as parameter 
void performInsertionSorting(): this function can apply sorting on array 
void display(): this method can display the array before sorting and after sorting 
5 3 8 4 2
*/
import java.util.*;
class InsertionSort{
	int arr[];
	void setArray(int a[]){
		arr=a;
	}
	void performInsertionSorting(){	
		for(int i=1;i<arr.length;i++){							
			int key=arr[i];
			int j=i-1;
			
			while(j>=0&&arr[j]>key){
				arr[j+1]=arr[j];
			
			j--;
			
		}
		arr[j+1]=key;
	}
	}

void display(){
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
	}
}
public class InsertionSort1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter arry elemnet 5 :");
		for(int i=0;i<arr.length ;i++){
			arr[i]=sc.nextInt();
		}
		InsertionSort is=new InsertionSort();
		is.setArray(arr);
		
		System.out.println("Array befor sorting:");
		is.display();
		
		is.performInsertionSorting();
		System.out.println("After sorting array:");
		is.display();
		
	}
}