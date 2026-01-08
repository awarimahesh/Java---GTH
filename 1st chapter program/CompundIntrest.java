import java.util.Scanner;
class CompoundIntrest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("calculet the compound intrest:");
		
		System.out.println("Total amount of after time T:");
		double time=sc.nextDouble();
		
		System.out.println("Principle amount in money:");
		double money= sc.nextDouble();
		
		System.out.println("Rate of per year:");
		double rate=sc.nextdouble();
		
		System.out.println("Time in year:");
		double time=sc.nextDouble();
		
		double time=money(1+rate/100)*time*time;
		sc.close();
		
			}
	}