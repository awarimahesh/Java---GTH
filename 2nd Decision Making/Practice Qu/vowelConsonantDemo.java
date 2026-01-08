import java.util.Scanner;
class vowelConsonantDemo
{
	public static void main(String args[])
	{
		char ch;
		String str="a";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character");
		ch=sc.next().charAt(0);
		if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z') )
		{
		  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("char is Vowel");
		}
        else
		{
			System.out.println("char is Consonant");
		}			
		}	
		else
		{
			System.out.println("char is Special symbol or Digit");
		}	
		
		
		}
}