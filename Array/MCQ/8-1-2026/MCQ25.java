import java.util.*;
public class MCQ25{
public static void main (String args[]){
	int[] a = {1,2,3};
int[] b = new int[a.length];

for(int i=0;i<a.length;i++){
    b[i] = a[i];
}
b[0] = 99;
System.out.println(a[0]);
System.out.println(b[0]);


	}
}