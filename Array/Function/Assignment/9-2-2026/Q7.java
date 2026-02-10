/*
Q7. Write a Java program using a void function to print all factors of a given number.
Explanation
Function accepts one integer parameter
Use a loop from 1 to the number
If number is divisible, print the factor
No return value

*/
class Q7{
	public static void main(String args[]){
		printFactor(12);
	}
	public static void printFactor(int no){
		for(int i=1;i<=no;i++){
			if(no%i==0){
				System.out.println("Factor of 12 is ="+i);
			}
		}
	}
}