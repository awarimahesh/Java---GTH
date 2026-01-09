import java.util.*;
public class MCQ6{
	public static void main(String args[]){
	int[] arr = {4, 8, 1, 10, 7};
	int max = arr[0], second = arr[0];
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] > max) {
			second = max;
			max = arr[i];
		} else if(arr[i] > second && arr[i] != max) {
			second = arr[i];
		}
	}
	System.out.println(second);

	}
}