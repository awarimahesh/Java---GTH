/*
Binary Search
*/
import java.util.*;
class BinarySearch{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int a[]=new int[5];
	System.out.println("Enter arry value:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
	
	System.out.println("Arry is:");
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	Arrays.sort(a);//binary search oly work on sorted arry.
	System.out.println("Arry After sorting:");
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	System.out.println("Enter Search key:");
	int skey=sc.nextInt();
	
	int index=-1;
	int L=0;
	int R=(a.length-1);
	
	// main logic
	while(L<R){
		int mid=L+(R-L)/2;//finding mid
		if(a[mid]==skey){
			index=mid;
			break;
			
		}
		if(a[mid]<skey){//her mid is less then skey thats whay using L=mid+1
			L=mid+1;
		}
		else{
			R=mid-1;
		}
	}
	if(index!=-1){
		System.out.println("Found:");
		
	}
	else{
		System.out.println("Not found:");
	}
	}
}