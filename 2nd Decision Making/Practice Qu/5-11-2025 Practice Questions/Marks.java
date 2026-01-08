//Q4 **Student Grade Calculation**
//Marks			Grade
//90–100		A+
//80–89			A
//70–79			B
//60–69			C
//Below 60		Fail
//---
import java.util.Scanner;
	class Marks{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student mark:");
		int marks =sc.nextInt();
		
		if(marks>=90 && marks<=100)
			System.out.println("A+ gread");
			else if(marks>=80 && marks<=89)
				System.out.println("A gread");
			else if (marks>=70 && marks<=79)
				System.out.println("b gread");
			else if(marks>=60 && marks<=69)
				System.out.println("c gread");
		else 
			System.out.println("Fail");
		}
	}