import java.util.Scanner;
class rectangleArea{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length:");
		double length=sc.nextDouble();
		System.out.println("Enter the breadth:");
		double breadth=sc.nextDouble();
		double area=length*breadth;
		System.out.println("rectangle area is :"+area);

	}
}