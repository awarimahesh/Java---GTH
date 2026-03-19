/*
Count Digits
*/
import java.util.*;
class CD{
	
	public static void main(String args[]){
		int no=12345,count=0;
		
		while(no>0){
			count++;
			no=no/10;
		}
		System.out.println(""+count);
	}
}