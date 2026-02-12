/*Q13. Create a recursive function that returns the sum of first N natural numbers.
Explanation:
Add current number with the sum of previous numbers.
Base condition: when N becomes 0, return 0.


Example: Input: N = 4	Output: 10
*/
public class Q13{
	public static void main(String args[]){
		
		int result=sum(4);
		System.out.println(""+result);
	}
	public static int sum(int no){
		
		if(no==0){
			return 0;
		}
		return no+sum(no-1);
	}
}