import java.util.Scanner;
	class MCQ29{
		public static void main(String args[]){
		int x = 1, y = 2;
		switch(x + y) {
			case 3:
				if(x < y) System.out.println("Yes");
				else System.out.println("No");
				break;
			default: System.out.println("Default");
		}
	}
}