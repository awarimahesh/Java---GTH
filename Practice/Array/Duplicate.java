/*WAP to create an array of size 5 and find duplicate values from the*/
import java.util.*;
public class Duplicate{
public static void main(String args[]){

int a[]={10,20,30,20,30};

System.out.println("arry is:");
Arrays.sort(a);

System.out.println("duplicate value:");
for(int i=0;i<a.length;i++){
if(a[i]==a[i+1]){
	System.out.println(a[i]);
}
}
}

}