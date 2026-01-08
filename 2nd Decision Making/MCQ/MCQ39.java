import java.util.Scanner;
	class MCQ39{
		public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		int x = 10;
		if(--x > 8)
			switch(x/2) {
				case 5: System.out.println("Five");
				case 4: System.out.println("Four"); break;
				default: System.out.println("Default");
    }

		}
	}