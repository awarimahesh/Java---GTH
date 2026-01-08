import java.util.Scanner;
	class MCQ23{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int a = 5, b = 10;
			if(a++ > 5)
				if(++b > 10)
					System.out.println("A");
				else
					System.out.println("B");
				else
					if(b-- == 10)
						System.out.println("C");
			else
				System.out.println("D");

		}
	}