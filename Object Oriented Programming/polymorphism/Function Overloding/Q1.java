/*Function overloding*/
import java.util.*;
public class Q1{
	public static void main(String args[]){
		calAdd(100,200);
		float result=calAdd(5.6f,6.8f);
		System.out.println("Addition of float is a:"+result);
	}
	public static void calAdd(int x,int y){
		System.out.println("Addition is:"+(x+y));
	}
	public static float calAdd(float x,float y){
		return(x+y);
	}
}