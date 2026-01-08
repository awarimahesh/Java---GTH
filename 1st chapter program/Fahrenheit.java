import java.util.Scanner;
class  Fahrenheit{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temprature in Celsius:");
		double Celsius=sc.nextDouble();
		
		double Fahrenhite=(Celsius * 9 / 5) + 32;
		System.out.println("Fahrenhite:"+Fahrenhite);
		
		sc.close();
			
		
	
	}
}