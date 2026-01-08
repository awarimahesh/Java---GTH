import java.util.Scanner;
	class MCQ31{
		public static void main(String args[]){
			int a = 1, b = 2, c = 3;
			if(a < b)
				switch(c - b) {
					case 1: System.out.println("One"); break;
					case 2: System.out.println("Two"); break;
					default: System.out.println("Default");
				}
			else
				System.out.println("Else");
			}
		}