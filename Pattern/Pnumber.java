import java.util.*;
	class PNumber{
		public static void main(String args[]){
		int i,j;
		for(i=1;i<=5;i++){
			int count=0;
			for(j=1;j<=9;j++){
				 
				if(j<=6-i || j>=4+i)
				{
					count=j<=6-i? ++count:j==4+i?count=6-i:--count;
					
					System.out.print(""+count);
					
				}
				else
				{
					System.out.print(" ");
					
				}
			}
		System.out.println();
		}
	
	}
	}