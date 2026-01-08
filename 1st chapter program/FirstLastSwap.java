import java.util.*;
	class FirstLastSwap.java{
		public static void main(String args[]){
		
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter the $ number :");
			int no=sc.nextInt();
		
			int First=no/1000;
			int Last=no%10;
			int middle=(no/10)%100;
		
			int swap=(Last*1000)+(middle*10)+First;
	
		
			System.out.println("This Swapping first number and last number:"+swap);
		
			sc.close();
		
		}
	

	
	
	}

