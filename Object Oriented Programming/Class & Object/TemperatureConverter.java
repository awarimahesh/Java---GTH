/*
9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method 
convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic.

*/
import java.util.*;
class Fahrenheit{
	double convertToFahrenheit(double Celsius){
		
		return(Celsius*9/5)+35;
	}

}
public class TemperatureConverter{
	
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter celsius value :");
	double Celsius=sc.nextInt();
	
	Fahrenheit fh=new Fahrenheit();
	
	double result=fh.convertToFahrenheit(Celsius);
	System.out.println("Fahrenheit"+result);
	
}
}