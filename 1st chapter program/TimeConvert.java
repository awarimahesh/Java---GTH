import java.util.Scanner;
	class TimeConvert{
		public static void main(String args[]){
			Scanner sc= new Scanner(System.in);
			
			System.out.println("conver time second in to minuts:");
			int totalSecond = sc.nextInt();
			
			int hours=totalSecond/3600;
			int remainingSecond=totalSecond%3600;
			int minuts=remainingSecond/60;
			int second=remainingSecond%60;
			System.out.println("This time:" +hours+ "hours" +minuts+ "minuts" +second+ "second");
		
		}
	}