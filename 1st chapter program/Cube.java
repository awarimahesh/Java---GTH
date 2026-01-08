import java.util.Scanner;
	class Cube{
		public static void main(String args[]){
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Cube is :");
			int num = sc.nextInt();
			
			int Cube = num * num * num;
			
			System.out.println("Cube is :"+num+"num" +Cube+"Cube");
			
			sc.close();
			
		
		}
	}