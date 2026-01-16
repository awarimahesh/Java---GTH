/*
5	4	3	2	1
		4	3	2	1
			3	2	1	
				2	1	
					1
*/
import java.util.*;
class Q3{
	public static void main(String args[]){
		int n=5;	
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i<j){
				System.out.print(" ");
				}
				else{
					System.out.print((n-j+1)+" ");
				}
			}
		
		System.out.println();
		}
	}
}