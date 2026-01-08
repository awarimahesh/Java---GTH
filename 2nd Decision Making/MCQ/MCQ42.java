import java.util.Scanner;
	class MCQ42{
		public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int x = 3;
		if(x++ == 3)
			switch(--x) {
				case 2: 
					System.out.println("Two");
					if(x++ == 2) System.out.println("Inc");
					break;
				default: System.out.println("Default");
			}
		else
			System.out.println("Else");


		}
	}