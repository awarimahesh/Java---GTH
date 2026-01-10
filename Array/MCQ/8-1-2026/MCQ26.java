import java.util.*;
public class MCQ26{
public static void main(String args[]){
	int[] a = {1,2,3};
int[] b = a;

for(int i=0;i<a.length;i++){
    a[i] = b[(i+1)%a.length];
}
System.out.println(a[0]);

}
}