import java.util.Scanner;
	class MCQ46{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = 8;
		if(n/2 == 4)
			switch(--n) {
				case 7:
					if(n%2==1)
						System.out.println("OddSeven");
					else
						System.out.println("EvenSeven");
					break;
				default:
					System.out.println("Default");
			}
		else
			System.out.println("Else");
				
		}
	}