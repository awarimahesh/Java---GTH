/*Sum of TwoDarray*/
import java.util.*;
public class TWDSUM{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[3][3];
		
		System.out.println("Enter array element:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display array:");
		for(int i=0;i<a.length;i++){
			int sum=0;
			for(int j=0;j<a[i].length;j++){
				
				sum=sum+a[i][j];
			System.out.print(a[i][j]);
			}
			System.out.println("    Sum is  :  "+sum);
		}
		
	}
}