/*Q3. Replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [10, 12, 15, 17, 20]
Output: [5, 12, 5, 17, 5]


Explanation:


10 is divisible by 5 → replaced with 5.
12 is not divisible by 5 → unchanged.
15 is divisible by 5 → replaced with 5.
17 is not divisible by 5 → unchanged.
20 is divisible by 5 → replaced with 5.
*/
public class Q3{
public static void main(String args[]){
    int a[]={10, 12, 15, 17, 20};

    System.out.println("Array is:");
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }

    System.out.println();

    for (int i=0;i<a.length;i++){
        if(a[i]%5==0){
            a[i]=5;
        }
    }
System.out.println("Final Array:");
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }



}
}