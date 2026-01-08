import java.util.*;
class Pattern37{
	public static void main(String args[]){
		int num=1;
		char ch='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++)
			{
				if(j%2==1){
					System.out.print(" "+num);
					num++;
				}
				else{
					System.out.print(" "+ch);
					ch++;
				}
			}
			System.out.println();
		}
	}
	}