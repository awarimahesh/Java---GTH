/*
 Q22. Create a class AreaCalculator with overloaded methods named area().
Method 1: Accepts one integer → calculate area of a square
Method 2: Accepts two integers → calculate area of a rectangle
Method 3: Accepts one double → calculate area of a circle
Display the calculated area for each shape.
Explanation: This question tests method overloading using different parameter types.
 Even if the number of parameters is same, Java differentiates methods based on data type.

*/

class Q22{
	public static void main(String args[]){
		
		int result1=area(5);
		System.out.println("Area of squre is a:"+result1);
		
		int result2=area(5,10);
		System.out.println("Area area of a rectangle:"+result2);
		
		double result3=area(10.2);
		System.out.println("Area ofarea of a circle:"+result3);
	}
	
	public static int area(int side){
		return side*side;
	}
	public static int area(int length,int breath){
		return length*breath;
	}
	public static double area(double redus){
		return 3.14*redus*redus;
	}
}