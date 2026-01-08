import java.util.Scanner;
class Intrest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("calcilet the simple intrest:");
		
		System.out.println("Enter principle amount");
		double principle = sc.nextDouble();
		
		System.out.println("enter the reat of intrest :");
		double rate=sc.nextDouble();
		
		System.out.println("enter time in (year):");
		double time=sc.nextDouble();
		
		double simpleintrest=principle*rate*time/100;
		System.out.println("Simple intrest is a:"+simpleintrest);
		
		sc.close();
		}
	}