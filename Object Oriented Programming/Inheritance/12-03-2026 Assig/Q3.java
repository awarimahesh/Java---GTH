/*
3) Shape and Rectangle
Create a class Shape with:
• Method displayShape()
Create a subclass Rectangle that:
• Takes length and width
• Calculates area
Task: Print shape name and area.

*/
import java.util.*;
class Shape{
	public void displayShape(){
		System.out.println("Shape:Rectangle");
	} 
	
	
	
}
class Rectangle extends Shape{
	private int length;
	private int width;
	
	public void setLength(int length){
		this.length=length;
		
	}
	public void setWidth(int width){
		this.width=width;
	}
	public int area(){
		return length*width;
	}
}
public class Q3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Rectangle re=new Rectangle();
		
		re.setLength(10);
		re.setWidth(5);
		
		re.displayShape();
		System.out.println("Area"+re.area());
		
		
	}
}