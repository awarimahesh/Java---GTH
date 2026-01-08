import java.util.Scanner;
	class MCQ22{
		public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		
		int x = 2;
		switch(x++) {
			case 1: System.out.println("One");
			case 2: System.out.println("Two");
			case 3: System.out.println("Three");
			default: System.out.println("Default");
			}

		
		}
	}