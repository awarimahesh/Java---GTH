/*
Q23. Create a class SalaryCalculator with overloaded methods 
named calculateSalary().
Method 1: Accepts basic salary only
Method 2: Accepts basic salary + bonus
Method 3: Accepts basic salary + bonus + tax
Each method should return the final salary.
Explanation: This is a real-world scenario showing how overloading 
avoids writing multiple method names.
	Different salary calculations are handled by the same method
	name with different parameters.
*/
class Q23{
	public static void main(String args[]){
		
		int result1 =calculateSalary(20000);
		System.out.println(""+result1);
		
		int result2 =calculateSalary(20000,1000);
		System.out.println(""+result2);
		
		int result3 =calculateSalary(20000,1000,2002);
		System.out.println(""+result3);
	}
	
	public static int calculateSalary(int salary){
		return salary;
	}
	public static int calculateSalary(int salary,int bouns){
		return salary+bouns;
	}
	public static int calculateSalary(int salary,int bouns,int tax){
		return salary+bouns-tax;
	}
}