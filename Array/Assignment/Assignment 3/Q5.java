/*Q4. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true


Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.
*/
public class Q4{
    public static void main(String args[]){
        int a[]={1, 2, 3, 2, 1};

        System.out.println("Array is:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
		
		boolean flag=true;
		
		for (int i=0;i<a.length/2;i++){
			if(a[i]!=a[a.length-i-1]){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("palindrom");
		}
		else{
			System.out.println("not palindrom:");
		}
}
}