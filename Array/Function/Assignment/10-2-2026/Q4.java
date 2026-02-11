/*
Q4. Write a method that takes two integers and returns the greater number.
Explanation
Compare both numbers
Return the larger one
Method Signature - static int findMax(int a, int b)

Input - a = 12, b = 20
Output - Maximum = 20

*/
class Q4{
	public static void main(String args[]){
		int result=findMax(12,20);
		System.out.println("Maximum is"+result);
	}
	public static int findMax(int a,int b)
	{
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
}