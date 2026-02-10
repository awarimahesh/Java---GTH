/*Q8. Write a Java program that uses a void function to calculate power of a number using a loop.
Explanation
Pass base and exponent to the function
Multiply base repeatedly using a loop
Print the final result inside the function


*/

class Q8{
	public static void main(String args[]){
		power(12,3);
	}
	public static void power(int base,int exponent){
		int result=1;
		for(int i=1;i<=exponent;i++){
			
			result=result*base;
			System.out.println(""+result);	
		}
		
	}
}