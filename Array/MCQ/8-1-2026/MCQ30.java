import java.util.*;
public class MCQ30{
public static void main(String args[]){
	int[] a = {1,2,3};
int[] b = new int[a.length];

for(int i=0;i<a.length;i++){
    b[i] = a[i];
    a[i] = 0;
}
System.out.println(b[2]);


}
}