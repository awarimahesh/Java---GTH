import java.util.Scanner;
	class MCQ49{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int x = 3;
		if(x-- == 3)
			switch(x) {
				case 2:
					if(++x == 3)
						System.out.println("ThreeAgain");
					else
						System.out.println("Two");
					break;
				default:
					System.out.println("Default");
			}
		else
			System.out.println("Else");


		}
	}