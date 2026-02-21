/*Function argument*/
import java.util.*;
class sum{
	int s=0;
	void Calsum(String Name,int ...a){
		System.out.println("Hello Mahesh ");
		for(int i=0;i<a.length;i++){
			s=s+a[i];
		}
		
		System.out.println("Addition is:"+s);
	}
	
}
public class FunctionArgument{
	public static void main(String args[]){
		
		sum su=new sum();
		
		su.Calsum("Mahesh",10,20,30,40,50,60);
	}
}