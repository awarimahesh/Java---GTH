/Write a programming to check whether a given array is palindrome array or not/
import java.util.*;
class Pal{
public static void main(String args[]){

int a[]={1,2,3,2,1};
boolean flag=true;
int n=arr.length;
for(int i=0;i<n/2;i++){
	if(a[i]!=a[n-1-i]){
		flag=false;
		break;
	}
}
if(flag){
	System.out.print("palindrom");
}
}
}