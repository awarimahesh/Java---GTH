import java.util.Scanner;
	class MCQ24{
		public static void main(String args[]){
			Scanner sc= new Scanner(System.in);
			int n = 4;
			switch(--n) {
				case 3:
				if(n % 2 == 1)
					System.out.println("Odd");
				else
					System.out.println("Even");
				break;
			default:
				System.out.println("Default");
			}

			
		}
	}