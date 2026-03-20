/*Remove Duplicate*/
import java.util.*;
class Rd{
public static void main(String args[]){
	int a[]={1,2,3,4,5,3,3,4};
	
	for(int i=0;i<a.length;i++){
		int(j=i+1;j<a.length;j++){
			if(a[i]==a[j]){
				for(int k=j;k<a.lenght-1;k++){
					if(a[k]==a[k+1]){
						
					}
					a.length--;
					j--;
					
				}
			}
		}
	}
	for(int i=o;i<a.length;i++){
		System.out.println(a[i]);
	}
}
}