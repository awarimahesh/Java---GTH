/*Example: WAP to create a function name as getPer() so this function can accept 6 types of  parameters and calculate its percentage and return it.
*/
import java.util.*;
class Q5{
public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	int s1,s2,s3,s4,s5,s6,per;
	
	System.out.println("enter the student marks:");
	s1=sc.nextInt();
	s2=sc.nextInt();
	s3=sc.nextInt();
	s4=sc.nextInt();
	s5=sc.nextInt();
	s6=sc.nextInt();
	int result=getper(s1,s2,s3,s4,s5,s6);
	System.out.println("result is:"+result);
	}
	public static int getper(int s1,int s2,int s3,int s4,int s5,int s6){
		int agg=s1+s2+s3+s4+s5+s6;
		return(agg/6);
	}
}