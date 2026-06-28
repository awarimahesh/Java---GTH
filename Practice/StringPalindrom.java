//palindrom Satring 
import java.util.*;
public class StringPalindrom{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Sring ....");
		
		String str = sc.nextLine();
		int i=0;
		int j=str.length()-1;
		
		boolean isPalindrom=true;
		while(i<j){
			if(str.charAt(i)!=str.charAt(j)){
				isPalindrom=false;
				break;
			}
			i++;
			j--;
			
		}
		if(isPalindrom){
			System.out.println("is palindrom:");
		}
		else{
			System.out.println("not palindrom;");
		}
	}
}