import java.util.Scanner;
	class MCQ33{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = 5, b = 0;
		if(a > 0)
			if(b == 0)
				switch(a) {
					case 5: System.out.println("Five"); break;
					default: System.out.println("Other");
				}
			else
				System.out.println("No");
		else
			System.out.println("Neg");
		}
	}
