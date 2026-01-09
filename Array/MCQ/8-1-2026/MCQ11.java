import java.util.*;
class MCQ11{
public static void main(String args[]){

	int[] arr = {5, 6, 7, 8};
	int num = 7;
	boolean found = false;
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] == num) {
			found = true;
			break;
		}
	}
		System.out.println(found);
	

}
}