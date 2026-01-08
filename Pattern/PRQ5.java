import java.util.*;
	class PRQ5{
		public static void main(String args[]){
			int i,j;
			for(i=1;i<=17;i++){
				for(j=1;j<=9;j++){
					if((j<=i && i<=9)||(j<=18-i && i>9)){
						System.out.print("*");
						
					}
					else{
						System.out.print(" ");
					}
				}
			System.out.println();
			}
			
		}
	}