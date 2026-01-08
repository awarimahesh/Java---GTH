/*Q12. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :      200

*/
import java.util.*;
	class Q12{
		public static void main(String args[]){
			Scanner sc =new Scanner(System.in);
			
			System.out.println("Enter array size");
			
			int size=sc.nextInt(); 
			int a[]=new int[size+1];
			
			System.out.println("Enetr element:");
			for(int i=0;i<a.length-1;i++){
				a[i]=sc.nextInt();
			}
			int pos=2;
			int value=200;
			 for (int i = size - 1; i >= pos - 1; i--) {
            a[i + 1] = a[i];
			}

			
			a[pos - 1] = value;
			
			System.out.println("Array is :");
				for(int i=0;i<a.length;i++){
					System.out.println(a[i]);
				}
			
			
			
		}
	}
