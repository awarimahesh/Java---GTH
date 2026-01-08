import java.util.Scanner;
	class DayConversion{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Day convert in month and week:");
		int TotalDay=sc.nextInt();
		
		int years=TotalDay/365;
		int remainingDay=TotalDay%365;
		
		int months=remainingDay/30;
		remainingDay=remainingDay%30;
		
		int weeks=TotalDay/7;
		remainingDay=TotalDay%7;
		
		System.out.println(years+"year(s)");
		System.out.println(months+"month(s)");
		System.out.println(weeks+"week(s)");
		
		sc.close();
		
		}
	}