import java.util.*;
	class TowPointArray{
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			int a[];
			System.out.println("Enter arry size:");
			int size=sc.nextInt();
			
			a=new int[size];
			
			System.out.println("enter arry element:");
			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			}
			
			System.out.println("Final array:");
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
			Arrays.sort(a);
			int count=1;
			for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                System.out.println(a[i - 1] + " --> " + count);
                count = 1;
            }
        }

        System.out.println(a[a.length - 1] + " --> " + count);
    }
}