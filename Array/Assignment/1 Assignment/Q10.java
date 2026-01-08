import java.util.Scanner;
	class Q10{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter array size:");
	int size= sc.nextInt();
	int a[]=new int[size];
	
	System.out.println("Enter arry ascending order:");
	
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}
	int pos = 3;          
        int index = pos - 1;  

        for (int i = index; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
	System.out.println("After delet elemnet final Array:");
	for(int i=0;i<a.length-1;i++){
		System.out.println(a[i]);
		
		
	}
	}
	}