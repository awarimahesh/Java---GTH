//Q21. Write a java program to check whether a number is neon or not.      	
        	//Input : 9
        	//Output : Neon Number
        	//Explanation: square is 9*9 = 81 and
        	//The sum of the digits of the square is 9. 
import java.util.Scanner;
	class Q21{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("Enter the number:");
	int sum=0;
	int num =sc.nextInt();
	int square=num*num;
	
	
	while(square>0){
		sum=sum+square%10;
		square=square/10;
	}
	if(num==sum)
		System.out.println("neon number:");
	else
		System.out.println("is not neon number:");
		}
	}			