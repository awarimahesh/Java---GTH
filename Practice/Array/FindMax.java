/*
Example: WAP to create class name as FindMax with two functions 
void setArray(int …x) : this function accept array as parameter 
int getMax(): this function can find the max value from an array and return it.

*/
public class FindMax{
public static void main(String args[]){
	
	int a[]=new int[]{10,20,30,40};
	getMax max=new getMax();
	
	System.out.println("Arry is:");
	for (int i=0;i<a.length;i++){
		System.out.println(""+a[i]);
	}
	
	}
	 void setArray(int ...x){
		for(int i=0;i<a.length;i++){
			System.out.println(""+a[i])
		}
		
	}

}