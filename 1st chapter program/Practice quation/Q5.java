import java.util.Scanner;
class Circumference{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the radius:");
		double radius =sc.nextDouble();
		
		double diameter=2*radius;
		System.out.println("diameter is :"+diameter);
		
		double Circumference=2*3.14*radius;
		System.out.println("Circumference is :"+Circumference);

		double area=3.14*radius*radius;
		System.out.println("area is a :"+area);
		
		sc.close();
			
		}
	}