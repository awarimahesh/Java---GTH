/*
Vowel or Consonant
Write a program that reads a character from the user and determines whether it is a vowel or consonant using 'switch'.
(Hint: Handle both uppercase and lowercase vowels.)
*/
import java.util.Scanner;
	class Q03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:System.out.println("Not vowels")
		}
	}
	}	