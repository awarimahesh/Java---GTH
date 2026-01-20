/*Example: WAP to create a function name as int getSum(int a[]) this function can accept an array as a parameter and calculate its sum and return it.
*/
import java.util.*;
class Q7{
public static void main(String args[])
	{
		int a[]=new int[]{10,20,30,40};
		
		
		int result=getsum(a);
		System.out.println("sum is:"+result);
	
	}
	public static int getsum(int m[])
	{
		int sum=0;
		for(int i=0;i<m.length;i++)
		{
			sum=sum+m[i];
		}
		return sum;
	}
}

