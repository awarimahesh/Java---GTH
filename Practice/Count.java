/*3. Count Vowels, Consonants, Digits and Special Characters ⭐

Input

Java123@

Output

Vowels = 2
Consonants = 2
Digits = 3
Special Characters = 1
*/

import java.util.*;
public class Count{
	public static void main(String atgs[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter string also");
		String str = sc.nextLine();
		
		
		int vowels=0;
		int digit=0;
		int spacial=0;
		int consonant=0;
		mahesh awari
		
		
		for(int i=0;i<str.length();i++){
			
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				vowels++;
				
			}
			else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
			consonant++;
			}
			else if(ch>='0'&&ch<='9'){
				digit++;
				
			}
			else{
				spacial++;
			}
			
		}
		
		System.out.println("digit"+digit);
		System.out.println("vowels"+vowels);
		System.out.println("consonant"+consonant);
		System.out.println("spacial"+spacial);
		
	}
}