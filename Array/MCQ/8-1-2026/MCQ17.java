import java.util.*;
public class MCQ17{
public static void main(String args[]){
int[] arr = {-2, 3, -5, 4, -1};
int count = 0;
for(int i = 0; i < arr.length; i++) {
    if(arr[i] < 0) {
        count++;
    }
}
System.out.println(count);

}
}