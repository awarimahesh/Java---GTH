/*Q6. Write a Java program to count frequency of each element in an array.
Explanation
Use nested loops.
Count matching elements.
Time Complexity
O(n²)
Example :- Array: {1, 2, 1}
	       Output :- 1 -> 2
           2 -> 1
*/
import java.util.*;
public class Q5{
	public static void main(String args[]){
		
		int a[]={1,2,1};
		
		for(int i=0;i<a.length;i++){
			int count=1;
			boolean printed=false;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					printed=true;
					break;
				}
				}
				if(printed){
					continue;
				}
				for(int j=i;j<a.length;j++){
					if(a[i]==a[j]){
						count++;
					}
				}
				System.out.println(a[i]+""+count);
				
			}
		}
	}
