import java.util.Scanner;
	class MCQ25{
		public static void main(String args[]){
			Scanner sc= new Scanner(System.in);
			
			
			int code = 1;
			switch(code + 1) {
				case 1: System.out.println("One");
				case 2: System.out.println("Two");
				case 3: System.out.println("Three"); break;
			default: System.out.println("Other");
			}

		}
	}