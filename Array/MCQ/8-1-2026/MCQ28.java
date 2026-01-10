import java.util.*;
class MCQ28{
public static void main(String args[]){
	
int[] a = {1,2,3};
int[] b = a;

for(int i=0;i<a.length;i++){
    a[i] = b[a.length-1-i];
}
System.out.println(a[1]);


}
}