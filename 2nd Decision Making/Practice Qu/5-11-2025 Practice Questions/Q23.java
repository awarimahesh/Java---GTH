//Q23. Write a java program to Check Number Is Spy Number or Not.
//Example :
  //      	 A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
	// Input : 1412
	//Output : Spy Number
	//Explanation :
	//sum = (1 + 4 + 1 + 2) = 8
	//product = (1 * 4 * 1 * 2) = 8
	//since, sum == product == 8
 import java.util.Scanner;
	class Q23{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	
	int num=sc.nextInt();
	int sum=0, product=1,temp=num;
	
	while(temp>0){
		int digit=temp%10;
		sum=sum+digit;
		product=product*digit;
		temp=temp/10;
	}
	if(sum==product)
		System.out.println("spay:");
	else
		System.out.println("is not spay:");
		}
	}			
