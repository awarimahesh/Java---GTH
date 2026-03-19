/*
Armstrong Number
*/
import java.util.*;
class A{
	public static void main (String args[]){
		
		int no=153,temp=no,sum=0;
		
		while(no>0){
			int r = no%10;
			
			sum=sum+r*r*r;
			
			no/=10;
			
			
		}
		System.out.println(sum==temp?"number is armstrong":"number is not arm strong");
	}
}