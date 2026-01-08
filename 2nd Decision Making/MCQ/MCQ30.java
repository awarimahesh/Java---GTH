import java.util.Scanner;
	class MCQ30{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		int n = 5;
		if(n-- > 4)
			if(n-- > 3)
				System.out.println("High");
			else
				System.out.println("Mid");
		else
			System.out.println("Low");

		}
	}
