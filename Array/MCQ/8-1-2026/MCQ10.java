import java.util.*;
class MCQ10{
public static void main (String args[]){
	int[] arr = {2, 3, 2, 4, 2};
	int num = 2, count = 0;
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] == num) {
			count++;
		}
	}
	System.out.println(count);


}
}