/*
10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.

*/
import java.util.*;
class CircleArea{
	double FindArea(double radius){
        return Math.PI * radius * radius;
	}
	
}
public class Q10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius");
		double radius =sc.nextInt();
		
		CircleArea ca=new CircleArea();
		double result=ca.FindArea(radius);
		
		System.out.println("CircleArea is:"+result);
		
	}
	
}