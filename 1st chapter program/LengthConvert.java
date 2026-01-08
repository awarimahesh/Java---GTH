import java.util.Scanner;
class LengthConvert{
	public static void main(String args[]){	

		Scanner sc = new Scanner(System.in);
		System.out.println("lenght in Centimeter:");
		double centimeter=sc.nextDouble();

		double meter=centimeter/100;
		System.out.println("in meter:"+meter);

		double kilometer=centimeter/100000;
		System.out.println("kilometer:"+kilometer);
		




	}	
}