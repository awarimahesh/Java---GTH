/*Q5. Write a Java method that takes an integer and returns the count of digits
 in that number.
Explanation
Divide the number by 10 repeatedly
Count how many times division happens
Return the count
Method Signature - static int countDigits(int num)
Input - num = 4567
Output - Digits = 4*/

class Q5{
	public static void main(String args[]){
		
		int result=countDigit(4567);
		System.out.println("Digit division times:"+result);
	}
	public static int countDigit(int no){
		int count=0;
		while(no!=0){
		no=no/10;
		count ++;
		}
		return count;
	}
}