import java.util.Scanner;
	class SubjectMark{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Subject mark and total :");
			double math=sc.nextDouble();
			double phy=sc.nextDouble();
			double hindi=sc.nextDouble();
			double marathi=sc.nextDouble();
		
			double total=(math+phy+hindi+marathi);
			System.out.println("total:"+total);

			double percentage=(total/400)*100;
			System.out.println("subject precentage is :"+percentage);
			

			sc.close();
			
			
			

		}

	}