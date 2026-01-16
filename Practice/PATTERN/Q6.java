import java.util.*;
public class Q6{
public static void main(String args[]){
	for(int i=1;i<=20;i++){
		for (int j=1;j<=20;j++){
		if(i==20||i==1||j==1||j==20||j==21-i||i==j){
			System.out.print("*");
		}
		else{
			System.out.print(" ");
		}
		

	}
	System.out.println();
	}
	}
}