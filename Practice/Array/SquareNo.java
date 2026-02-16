/*Example: WAP to create class name as Square with two functions 
void setValue(): this function is used for accept  number as parameter 
int getSquare(): this function is used to calculate square and return it.

*/

import java.util.*;
class Square{
	int no;
	Scanner sc= new Scanner(System.in);
	void setValue(){
	
	System.out.println("Enter the value:");
	no=sc.nextInt();
	
	}
	int getSquare(){
		return no*no;
	}
}
public class SquareNo{
	public static void main(String args[]){
		Square s1=new Square();
		
		s1.setValue();
		int result=s1.getSquare();
		System.out.println(""+result);
	}
}