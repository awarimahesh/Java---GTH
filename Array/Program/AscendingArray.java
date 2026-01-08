/*Example: WAP to store value in array in ascending order and find the missing values of array?
*/
import java.util.Scanner;
	class AscendingArray{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int a[]=new int[5];
			System.out.println("Enter array ascending value:");
			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			}
			System.out.println("missing value:");
			for(int  i=1;i<a.length;i++){
				int prev=a[i-1];
				int next=a[i];
				while(prev<(next-1)){
					++prev;
				System.out.println(prev);
				}
			}
		}
	}