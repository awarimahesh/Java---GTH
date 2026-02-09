/*
Example: WAP to create billing application and we have two types of bill 
Bill with GST 
Bill with GST 
You have to create two function 
int getBill(int qty,int rate): this function calculate bill without GST and return it
int  getBill(int qty,int rate,int gstRate): this function can calculate bill with gst and return it 


*/
import java.util.*;
class Q6{
	public static void main(String args[]){
		
		int billWithoutGST=getBill(10,100);
		System.out.println("Bill without gst:"+billWithoutGST);
		int billWithGST=getBill(10,100,18);
		System.out.println("Bill with GST:"+billWithGST);
	}
	public static int getBill(int Qut,int ret){
		return (Qut*ret);
		
	}
	public static int getBill(int Qut,int ret,int gstRet){
		int gstamt=(Qut*ret)*18/100;
		return(Qut*ret)+gstamt;
	}
	
	
}