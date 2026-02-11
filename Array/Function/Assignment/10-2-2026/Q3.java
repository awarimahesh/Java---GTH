/*
Q3. Write a Java method that accepts a number and returns its square.
Explanation
Square means number × number
The method calculates and returns the result
Method Signature - static int square(int n)
Input - n = 5
Output - Square = 25

*/
class Q3{
	public static void main(String args[]){
		int result=square(10);
		System.out.println("Squre is:"+result);
	}
	public static int square(int no){
		int result=no*no;
		return result;
	}
}