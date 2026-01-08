import java.util.Scanner;
	class WithoutSwapp{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter first number:");
			int a =sc.nextInt();
			
			System.out.println("Enter Second number:");
			int b= sc.nextInt();
			
			System.out.println("Before Swapping:a="+a+",b="+b);
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("After Swapping a:a="+a+",b="+b);
			
			sc.close();
		
		
		}
	}