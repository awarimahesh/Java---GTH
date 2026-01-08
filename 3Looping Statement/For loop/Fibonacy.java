import java.util.Scanner;
	class Fibonacy{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
			
			int n;
			int f=0;
			int s=1;
			int sum;
			n=sc.nextInt();
			for(int i=1;i<=n;i++){
			System.out.println(""+f);	
				sum=f+s;
				f=s;
				s=sum;
			}
			
			
		
			}
		}
	