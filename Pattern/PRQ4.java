import java.util.*;
	class PRQ4{
	public static void main(String args[])
	{
		for(int i=1;i<=10;i++){
			for(int j=1;j<=19;j++){
				if(j>=11-i && j<=9+i){
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