//Q5 **Check whether a character is a vowel or consonant using nested if**

//char --1  vowel
//2 consonant
//3 special symbol
import java.util.Scanner;
	class Vowel{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the alph:");
	char ch=sc.next().charAt(0);
	
	if(ch=='a'	|| ch=='e' || ch=='i' ||ch=='o'||ch=='u' || ch=='O' || ch=='A' ||ch=='E'||ch=='I' ||ch=='U')
	{
		System.out.println("Is the Vowels:");
	}else
	{
		System.out.println("consonant:");
		}
	}
}