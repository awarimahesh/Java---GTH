import java.util.*;
class MCQ29{
public static void main (String args[]){
	int[] a = {10,20};
int[] b = a;

for(int i=0;i<a.length;i++){
    a[i] = a[i] / 10;
}
System.out.println(b[1]);


}
}