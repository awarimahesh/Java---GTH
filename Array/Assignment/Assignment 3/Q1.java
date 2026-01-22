/*Q1. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]


Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.
*/
public class Q1{
	public static void main(String args[]){
		
		int a[]={3,6,7,9,10};
		
		System.out.println("Array is:");
		for (int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
		}
		for(int i=0;i<a.length;i++){
			if(a[i]%3==0){
				a[i]=-1;
			}
		}
		System.out.println("updated array is:");
		for (int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		
	}
}