//Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.
import java.util.Scanner;
	class Q24{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the character:");
	
	char ch=sc.next().charAt(0);
	if(ch>='A'&&ch<='Z')
		System.out.println("Upper char");
	else if(ch>='a'&&ch<='z')
		System.out.println("lower case:");
	else
		System.out.println("Not A char:");
		}
	}			
