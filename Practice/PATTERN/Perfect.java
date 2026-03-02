/*
Q22. Write a java program to Check Number Is Perfect Number or Not.
*/
import java.util.*;
public class Perfect{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter number");
			int num=sc.nextInt();
			
			
			int sum=0;
			for(int i=1;i<=num/2;i++){
				if(num%2==0){
					sum=sum+i;
				}
			}
			
			if(sum==num){
				System.out.println("Number is perfect number:");
			}
			else{
				System.out.println("not perfect number:");
			}
			}
		}
	