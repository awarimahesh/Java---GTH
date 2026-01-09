import java.util.*;
class MCQ5{
public static void main(String args[]){
	int[] arr = {10, 5, 8, 2, 6};
	int min = arr[0];
	for(int i = 1; i < arr.length; i++) {
		if(arr[i] < min) {
			min = arr[i];
		}
	}
	System.out.println(min);

	}
}