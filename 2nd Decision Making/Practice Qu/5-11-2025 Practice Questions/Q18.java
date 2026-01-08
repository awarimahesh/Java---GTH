//Q18. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
import java.util.Scanner;
	class Q18{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the student mark's:");
	int marks = sc.nextInt();
	if(marks>=40)
		System.out.println("Student is pass:");
	else
		System.out.println("Fail");
	
		}
	}