import java.util.Scanner;
	class MCQ21{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int a = 3;
			if(++a == 4)
				switch(a - 1) {
					case 2: System.out.println("Two"); break;
					case 3: System.out.println("Three"); break;
					default: System.out.println("Other");
					}
			else
				System.out.println("Else");

			}
		}