/*Example: WAP to create class name as FindMax with two functions 
void setArray(int …x) : this function accept array as parameter 
int getMax(): this function can find the max value from an array and return it.
*/
import java.util.*;
class FindMax{
	int arr[],max=0;
	void setArray(int ...x){
		arr=x;
		
	}
	int getMax(){
		 max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	
	
}
public class MaxArrayPass{
	public static void main(String args[]){
		
		FindMax fm= new FindMax();
		int a[]=new int[]{19,20,56};
		fm.setArray(a);
		int result=fm.getMax();
		System.out.println("Max value is:"+result);
	}
}