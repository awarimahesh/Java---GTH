//Q4. Electricity Bill Calculation
//	Write a program to input electricity units and calculate bill as:

//Units		Rate per unit
//0–100		₹5
//101–200		₹7
//201–300		₹10
//Above 300	₹15

//Example:
//If input = 250 → total = 100×5 + 100×7 + 50×10 = ₹1700
  //                750    =100*5+100*7+100*10+450*15=

import java.util.Scanner;
	class Bill{
		public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bill units");
		int unit=sc.nextInt();
		int total=0; 
		
		if(unit<=100){
			total=unit*5;
			}
			else if (unit<=200){
				total=(100*5)+(unit-100)*7;
			}
			else if (unit<=300){
				total=(100*5)+(100*7)+(unit-200)*10;
			}
		else
			total=(100*5)+(100*7)+(100*10)+(unit-300)*10;
			System.out.println("total bil is :"+total);
			
				
		
		}
	}