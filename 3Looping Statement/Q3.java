/*
3. WAP input base and index value from keyboard and calculate power of 
       number.

*/
import java.util.Scanner;
	class Q1{
		public static void main (String args[]){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the base value :");
			int base =sc.nextInt();
			System.out.println("Enter the Index value:");
			int index = sc.nextInt();
			
			int i=1;
			int result=1;
			while(i<=index){
				result=result*base;
				i++;
				
			}
			System.out.println("popwer of number is:"+result);
			
			
		}
	}