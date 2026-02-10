import java.util.*;
	class PRQ{
		public static void main (String args[]){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				if(i==1||i==10||j==1||j==10||j==11-i|| i==j)
				{
					System.out.print("+");
				}
				else{
					System.out.print(" ");
				}
			}
		System.out.println();
			}
		
		}
	}