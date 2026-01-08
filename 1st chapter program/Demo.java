import java.util.*;
	class Demo{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int First,Last,no;
		System.out.println("Enter the number:");
		no=sc.nextInt();
		
		Last=no%10;
		no=no/10;
		
		First=no/100;
		no=no%100;
		
		Last=Last*1000;
		no=no*10;
		no=Last+no+First;
		
		System.out.println("After the swapping:"+no);
		sc.close();
		
		
		
		
		
		
		
		
		
		}
	

	
	
	}

