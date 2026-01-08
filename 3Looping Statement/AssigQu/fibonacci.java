/*Q2. WAP to print the fibonacci series up to n
	0 1 1 2 3 5 8
*/
import java.util.Scanner ;
	class fibonacci{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Eneter the number :");
	int n = sc.nextInt();
	int f=0;
	int s=1;
	int sum;
	for(int i=1;i<=n;i++){
	System.out.println(""+f);
	sum=f+s;
	f=s;
	s=sum;
	
	}
	}
	}