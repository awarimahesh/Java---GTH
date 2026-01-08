import java.util.Scanner;
public class QQ{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int [3][3];
		
		System.out.println("Enetre arrsy element:");
		for (int i=0;i<a.length;i++){
			for (int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Final matrices:");
		for (int i=0;i<a.length;i++){
			for (int j=0;j<a[i].length;j++){
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
	
	
	
	
	}
}