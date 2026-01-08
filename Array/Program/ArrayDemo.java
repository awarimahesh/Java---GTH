import java.util.Scanner;
	class ArrayDemo{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			int a[];
			
			System.out.println("Enter the array size:");
			int size=sc.nextInt();
			
			a=new int [size];
			
			System.out.println("Enter the Element:");
			for(int i=0;i<a.length;i++){
				 a[i]=sc.nextInt();
				
			}
			System.out.println("final array:");
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
			int max=a[0];
			for(int i=0;i<a.length;i++){
				if(max<a[i]){
					max=a[i];
				}
			}
			System.out.println("Max element is :"+max);
			
			int min=a[0];
			for(int i=1;i<a.length;i++){
				if(min>a[i]){
					min=a[i];
					
				}
			}
			System.out.println("Min:"+min);
			
		}
	}