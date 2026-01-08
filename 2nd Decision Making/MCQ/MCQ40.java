import java.util.Scanner;
	class MCQ40{
		public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a = 1, b = 2, c = 3;
		if(++a == 2)
			if(c-- > 2)
				switch(b + c) {
					case 4: System.out.println("Four"); break;
					case 5: System.out.println("Five"); break;
					default: System.out.println("Default");
				}
			else
				System.out.println("Fail");
		else
			System.out.println("End");

    

		}
	}