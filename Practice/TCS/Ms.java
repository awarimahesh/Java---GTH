/*
Max second
*/
import java.util.*;
class Ms{
public static void main(String args[]){
	int a[]={1,2,3,4,5,69};
	
	int max=a[0];
	int second=Integer.MIN_VALUE;
	
	for(int i=1;i<a.length;i++){
		if(a[i]>max){
			second =max;
			max=a[i];
		}
		else if(a[i]>second && a[i]!=max ){
			second=a[i];
		}
		}
		System.out.println(second);
	}
}