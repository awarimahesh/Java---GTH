/*
Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 55
Explanation:
Traverse the array element by element.
If an element is divisible by 2, it is even. Otherwise, it is odd.
Separate lists are displayed for even and odd values.



*/
import java.util.Scanner;
class Q3{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter arry element:");
	int a[]=new int [6];
	for (int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}
	System.out.println("even array:");
	for(int i=0;i<a.length;i++){
		if(a[i]%2==0){
			System.out.println("Even array elemgitent:"+a[i]);
		}
	}
	System.out.println("Odd array:");
	for(int i=0;i<a.length;i++){
		if(a[i]%2!=0){
			System.out.println("oDD array element:"+a[i]);
		}
	}
	
	}
	}