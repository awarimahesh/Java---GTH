/*Example: WAP to create class name as Power 
void setValue(int base,int index):  this function is used for accept two value as parameter 
Base and index 
int getPower(): this function can calculate the power of a number and return it.*/
import java.util.*;
class Power{
	int base,index,p=1;
	void setValue(int b,int ind){
		base=b;
		index=ind;
	}
	int getPower(){
		for(int i=1;i<=index;i++){
			p=p*base;
		}
		return p;
	}
}
public class PowerFind{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base value And index value:");
		
		int base=sc.nextInt();
		int index=sc.nextInt();
		
		Power p=new Power();
		
		
		p.setValue(base,index);
		int result=p.getPower();
		System.out.println("Power is:"+result);
	}
}