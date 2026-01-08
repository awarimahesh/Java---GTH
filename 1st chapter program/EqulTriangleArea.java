import java.util.Scanner;
class EqulTriangleArea {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Equilatral triangle area:");
		double side=sc.nextDouble();
		
		double area=(Math.sqrt(3)/4)*side*side;
		System.out.println("area:"+area);
		sc.close();
		
	}

}