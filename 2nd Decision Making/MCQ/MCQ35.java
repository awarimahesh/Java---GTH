import java.util.Scanner;
	class MCQ35{
		public static void main (String args[]){
		int x = 7;
		if(x % 2 == 1)
			switch(x - 5) {
				case 1: System.out.println("One"); break;
				case 2: System.out.println("Two"); break;
				default: System.out.println("Other");
			}
		else
			System.out.println("Even");
	}
}