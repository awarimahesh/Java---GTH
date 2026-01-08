import java.util.Scanner;
	class MCQ41{
		public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		switch(++n) {
			case 0:
				System.out.println("Zero"); break;
			case 1:
				if(n-- == 1)
					System.out.println("One");
				else
					System.out.println("Not One");
				break;
			default:
				System.out.println("Default");
}

		}
	}