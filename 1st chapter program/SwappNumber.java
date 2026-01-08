import java.util.Scanner;
class SwappNumber{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number:");
			int a =sc.nextInt();
			
			System.out.println("Enter the Second number:");
			int b=sc.nextInt();
			
			System.out.println("Before Swapping: a="+a+",b="+b);
			
			int temp=a;
			a=b;
			b=temp;
			
			System.out.println("After Swapping: a="+a+",b="+b);
			
			sc.close();
			
		
		}
	
	}