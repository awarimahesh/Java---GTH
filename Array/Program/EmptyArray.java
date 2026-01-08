/*
Array empty or not.
*/
import java.util.Scanner ;
	class EmptyArray{
		public static void main (String args[]){
			int a[]=new int[5];
			//a[2]=100;  
			
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
			boolean flag=false;
			for(int i =0;i<a.length;i++){
				if(a[i]!=0){
					flag=true;
					break;
				}
			}
			if (flag){
				System.out.println("not empty:");
			}
			else{
				System.out.println("empty:");
			}
		}
	}
			
			
			
			
			