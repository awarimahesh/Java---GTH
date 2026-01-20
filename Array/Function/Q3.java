import java.util.*;
public class Q3{
public static void main(String args[]){
	
	int a[]=new int[]{10,20,30,40,20};
	show (a);
	System.out.println("Disp;ay arry:");
	for (int i=0;i<a.length;i++){
	System.out.println(""+a[i]);
	}
}
	
	public static void show(int m[]){
		m[2]=100;
	}
}