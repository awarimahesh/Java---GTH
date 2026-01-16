/*		
a
a b
a b c
a b c d 
a b c d e 
*/

import java.util.*;
public  class Q4{
public static void main(String args[]){
	for(int i=1	;i<=5;i++){
		for(int j=1;j<=5;j++){
			if(i>=j){
				System.out.print((char)('a'+j-1)+"");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}