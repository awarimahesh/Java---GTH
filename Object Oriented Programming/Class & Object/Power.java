/*void setValue(int base,int index):  this function is used for accept two value as parameter 
Base and index 
int getPower(): this function can calculate the power of a number and return it.
*/
import java.util.*;
class Function{
	int index,int base ,p=1;
	void setValue(int ind,int b){
		index=ind;
		base=b;
	}
	int getPower(){
		for(int i=0;i<=index;i++){
			p=p*base;
			
		}
		return p;
	}
}
public class PowApplication{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter base value:");
	int base=sc.nextInt();
	int index=sc.nextInt();
	
	Function fu=new Function();
	fu.setValue(base,index);
	int result=fu.getPower();
	System.out.println("Power is:"+result);
}
}