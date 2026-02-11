/*Q11. Write a recursive function that prints numbers from 1 to N.
Explanation:
The function should print the current number.
It should call itself with the next number.
Stop when the number becomes greater than N.
*/
class Q11{
	public static void main(String args[]){
		
		printNumber(1,10);
	}
	public static void printNumber(int current,int n ){
		if(current> n){
			return;
		}
			System.out.println(""+current);
			
			printNumber(current+1, n);
		
			
	}
}