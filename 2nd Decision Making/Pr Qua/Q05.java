/*
 Q5. Electricity Bill Slabs
Write a program that takes electricity units as input and calculates the bill using 'switch' on ranges:
 1–100 units → ₹5/unit
 101–200 units → ₹7/unit
 201–300 units → ₹10/unit
 Above 300 units → ₹15/unit

*/
import java.util.Scanner;
	class Q05{
		public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the unit:");
		int unit=sc.nextInt();
		int bill=0;
		
		switch(unit/100){
			case 1:
				bill=unit*5;
				break;
			case 2:
				bill=(100*5)+(unit-100)*7;
				break;
			case 3:
				bill=(100*5)+(100*7)+(unit-100)*10;
				break;
			case 4:
				bill=(100*5)+(100*7)+(100*10)+(unit-100)*15;
				break;
			
		}
		System.out.println("Bill is  "+bill);
	}
}