/*Q14. Write a recursive function to count how many digits are present in a given number.
Explanation:
Remove the last digit using division (number / 10).
Increase count in each recursive call.
Stop when the number becomes 0.


Example: Input: 4567	 Output: 4
*/
public class Q14{
	public static void main(String args[]){
		
		int result=digit(1234);
		System.out.println(""+result);
	}
	public static int digit(int no){
		int count=0;
		if(no==0){
			return 0;
		}
		else{
			no=no/10;
			count ++;
			
			
		
		return count;
		}
	}
}