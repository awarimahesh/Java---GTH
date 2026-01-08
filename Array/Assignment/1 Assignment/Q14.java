/*Q14.  Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.
*/
import java.util.*;
public class Q14{
	public static void main(String srgs[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("array is:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("Final array:");
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<i;j++){
			if(a[i]==a[j]){
				flag=true;
				break;
			}	
			}
			if(!flag){
				System.out.println(a[i]);
			}
		}	
	}
}
