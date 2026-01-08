import java.util.Scanner;;
	class MCQ37{
		public static void main(String args[]){
		int a = 3, b = 4;
			if(a++ > 3)
				switch(b--) {
					case 3: System.out.println("Three"); break;
					case 4: System.out.println("Four");
					default: System.out.println("Default");
				}
			else
				System.out.println("Else");
			}
		}