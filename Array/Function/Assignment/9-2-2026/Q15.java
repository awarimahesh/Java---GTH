/*Q15. Write a recursive function to reverse a given number.
Explanation:
Take the last digit and place it in reverse order.
Continue recursion by removing the last digit.
Stop when the number becomes 0.
Example: Input: 123		 Output: 321
*/
class Q15{
	public static void main(String args[]){
		
		int result=reversNumber(1234);
		System.out.println(""+result);
	}
	public static int reversNumber(int no){
		
		if(no==0){
			return reverse;
		}
		reverse=revers*10(no%10);
		return reverseNumber(no/10);
	}
}