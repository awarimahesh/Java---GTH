import java.util.Scanner;
class maxTernary{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Enter two number:");
		x=sc.nextInt();
		y=sc.nextInt();
	
		int z;
		z=x>y?x:y;
		System.out.println("max number is:"+z);

 	}

}
