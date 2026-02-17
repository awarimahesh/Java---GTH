/*
7. Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a
 person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation.

*/
import java.util.*;
class Voter{
	void isEligible(int age){
		if(age>18){
			System.out.println("is isEligible for Voting:");
		}
		else{
			System.out.println("Is not eligibale:");
		}
	}
	
}
public class Voting7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		Voter v=new Voter();
		v.isEligible(age);
	}
	
	
}