import java.util.Scanner;
class CompoundIntrest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("calculet the compound intrest:");
		
		
		
		System.out.println("Principle amount in money:");
		double money= sc.nextDouble();
		
		System.out.println("Rate of per year:");
		double rate=sc.nextDouble();
		
		System.out.println("Time in year:");
		double time=sc.nextDouble();
		
		double amount = money * Math.pow((1 + rate / 100), time);

		System.out.println("amount:"+amount);
		sc.close();
		
			}
	}