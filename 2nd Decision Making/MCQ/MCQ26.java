import java.util.Scanner;
	class MCQ26{
		public static void main (String args[]){
			Scanner sc = new Scanner(System.in);

			int x = 5;
			if(x++ == 5)
			switch(x) {
				case 5: System.out.println("Case5"); break;
				case 6: System.out.println("Case6"); break;
			default: System.out.println("Default");
			}
			else
				System.out.println("Else");

		}
	}