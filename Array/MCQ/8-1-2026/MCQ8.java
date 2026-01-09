import java.util.*;
class MCQ8{
	public static void main(String args[]){
	int[] arr = {-1, 3, 5, -2, 0};
	int count = 0;
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] > 0) {
			count++;
		}
	}
	System.out.println(count);

	}
}