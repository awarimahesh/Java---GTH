import java.util.Scanner;
	class MCQ38{
			public static void main(String args[]){
		int x = 7;
		if(--x == 6)
			if(x++ == 6)
				switch(x) {
					case 6: System.out.println("Six"); break;
					case 7: System.out.println("Seven"); break;
					default: System.out.println("Default");
				}
			else
				System.out.println("Fail");
		else
			System.out.println("End");
			}
	}
