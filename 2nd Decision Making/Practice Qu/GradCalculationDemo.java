import java.util.Scanner;
class GradCalculationDemo
{
	public static void main(String args[])
	{
		int TotalMarks;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Total Marks of Student");
		 TotalMarks=sc.nextInt();
		 if(TotalMarks>=90 && TotalMarks<=100)
		 {
			 System.out.println("A+");
		 }
		 else
		 {
			 if(TotalMarks>=80 && TotalMarks<=89)//1st inner
			 {
				 System.out.println("A");
			 }
			 else
			 {
				if(TotalMarks>=70 && TotalMarks<=79) //2
			      {
				   System.out.println("B");
			      }
                   else
				     {
					   if(TotalMarks>=60 && TotalMarks<=69)//3
						 {
						  System.out.println("C");
						 }
                         else
						 {
							 System.out.println("Fail");
						 }							 
					 }					   
			 }
		 }
	}