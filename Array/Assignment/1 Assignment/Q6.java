/*Q6. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/



import java.util.Scanner;
class FoundArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a[];
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		a=new int[size];
		
		System.out.println("enter the arry value :");
		for(int i=0;i<a.length;i++){
		
		a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the serach element");
		int skey=sc.nextInt();
		
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==skey){
				flag=true;
				break;
				
			}
		}
		if(flag){
			System.out.println("found");
		}
		else{
			System.out.println("not found:");
		}
	}
}