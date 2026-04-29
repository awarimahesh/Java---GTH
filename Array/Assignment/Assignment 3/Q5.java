/*Q5. Return the first element that repeats in the array.
Input: {10, 5, 3, 4, 3, 5, 6}
Output: First repeating element is 5


Explanation:


Traverse from left:
10 → first time.
5 → first time.
3 → first time.
4 → first time.
3 → already seen earlier → repeating, but not the first repeating (we must check carefully).
5 → this was the earliest element that repeats.


Therefore, the first repeating element is 5.
*/
public class Q5{
    public static void main(String args[]){

        int a[]={10, 5, 3, 4, 3, 5, 6};

        System.out.println("Array is:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        int firstrep=0;
        int rep[]=new int[a.length];
        int index=0;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    rep[index]=a[i];
                    index++;
                }
            }
		}
            System.out.println("First repeatinng element is"+rep[0]);
        }
    }
	