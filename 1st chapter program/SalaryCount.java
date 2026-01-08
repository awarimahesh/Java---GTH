//Write a Java program to calculate the net salary of an employee.
//Input: basic salary, HRA %, DA %, and tax %.
import java.util.Scanner;
	class SalaryCount{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("basic salary:");
			double basic=sc.nextDouble();
			
			System.out.println("hra %:");
			double hrapercent=sc.nextDouble();
			
			System.out.println("da %:");
			double dapercent=sc.nextDouble();
			
			System.out.println("tax %:");
			double taxpercent=sc.nextDouble();
			
			double hra = (hrapercent / 100) * basic;
			double da = (dapercent / 100) * basic;

			double grossalary=hra+da+basic;
			double tax=(taxpercent/100)*grossalary;
			double netsalary=grossalary-tax;
			
			System.out.println("grossalary:"+grossalary);
			System.out.println("tax:"+tax);
			System.out.println("netsalary:"+netsalary);
			sc.close();
			
		}
	}