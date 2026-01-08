import java.util.Scanner;
	class MCQ47{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = 1, y = 2;
		if(++x == 2)
			switch(y = x + y) {
				case 3:
					if(y-- == 3)
						System.out.println("Three");
					else
						System.out.println("NotThree");
					break;
				case 4:
					System.out.println("Four");
					break;
				default:
					System.out.println("Default");
			}
		else
			System.out.println("Else");

		}
	}