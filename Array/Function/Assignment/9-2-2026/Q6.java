/*
Q6.Write a Java program that uses a void function to check whether a given two-digit number is a special number.
A number is special if: (sum of digits + product of digits) = original number
Explanation
Pass the number to a function
Extract digits using % and /
Calculate sum and product
Print result inside the function

*/
class Q6{
	public static void main(String args[]){
	SpacialNumber(59);	
	}
	public static void SpacialNumber(int no){
		int sum=0;
		int temp=no;
		int product=1;
		
		while(no>0){
			int digit=no%10;
			sum=sum+digit;
			product=product*digit;
			no=no/10;
			
		}
		if(sum+product==temp){
			System.out.println("Spacial Number:"+temp);
			
		}
		else{
			System.out.println("not spacial number:"+temp);
		}
		
	}
}