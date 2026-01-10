import java.util.*;
public class MCQ27{
public static void main(String args[]){
	int[] a = {1,2,3};
int sum = 0;

for(int i=0;i<a.length;i++){
    sum += a[i];
    a[i] = sum;
}
System.out.println(a[2]);


	}
}