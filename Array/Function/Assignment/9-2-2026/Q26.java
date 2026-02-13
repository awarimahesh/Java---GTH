/*
Q26. Create a class AdvancedCalculator that contains overloaded calculate()
 methods to perform:
		Addition of two integers
		Addition of two doubles
		Addition of three integers
		Addition of an integer and a double
Explanation: This question tests how Java decides which overloaded method to 
call based on:
Number of parameters
Type of parameters
Order of parameters
It also checks understanding of type promotion and method resolution.

*/
class Q26{
	public static void main (String args[]){
		
		Q26 obj=new Q26();
		
		obj.calculate(10,10);
		obj.calculate(10.2,10.2);
		obj.calculate(1,2,3);
		
		obj.calculate(10,10.2);
	}
	public static void calculate(int a,int b){
		System.out.println("Two Number addition is:"+(a+b));
	}
	public static void calculate(double a,double b){
		System.out.println("Addition of two double:"+(a+b));
	}
	public static void calculate(int a,double b){
		System.out.println("Addition of one int And One is double is :"+(a+b));
	}
	public static void calculate(int a,int b,int c){
		System.out.println("Addition of Three number is:"+(a+b+c));
	}
}