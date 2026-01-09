import java.util.*;
public class MCQ1{
	public static void main(String args[]){
	int[] arr = {5, 12, 7, 3, 19};
	int max = arr[0];
	for(int i = 1; i < arr.length; i++) {
		if(arr[i] > max) {
			max = arr[i];
		}
	}
	System.out.println(max);

	}
}