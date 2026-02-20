/*Two Dimensional array*/
import java.util.*;
public class TwoDarray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a[][]=new int[3][3];
		
		System.out.println("Enter array element:");
		for(int i=o;i<a.length;i++){
			for(int j=i;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
	}
}