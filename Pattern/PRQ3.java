import java.util.*;
	class PRQ3{
	public static void main(String args[]){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				if(i>=j){
					System.out.print((char)64+j);
				}
				else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		}
	}