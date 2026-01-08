import java.util.Scanner;
class Triangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("enter the angle of triangl:");
		double angle1=sc.nextDouble();
			
		System.out.println("enter the Angle of triangl");
		double angle2=sc.nextDouble();
		
		Double angle3 =180-(angle1+angle2);//formula 
		System.out.println("angle3:"+angle3);
		
		sc.close();
		}

	}