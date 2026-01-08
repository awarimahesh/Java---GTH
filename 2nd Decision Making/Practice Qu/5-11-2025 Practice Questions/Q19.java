//Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.
import java.util.Scanner;
	class Q19{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the student mark's:");
	int marks = sc.nextInt();
	if(marks>=90)
		System.out.println("Excellent Student");
		else if(marks>=75)
			System.out.println("Student is good:");
		else if(marks>=50)
			System.out.println("Avreage");
		else if(marks<50)
			System.out.println("Student is poor:");
	else
		System.out.println("Student is fail");
	
		
	
		}
	}