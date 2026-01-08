import java.util.Scanner;
	class MCQ43{
		public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = 6;
		switch(--n) {
			case 5:
				if(n++ == 5)
					System.out.println("Five");
				else
					System.out.println("Not Five");
				break;
			default:
				System.out.println("Default");
		}

		}
	}