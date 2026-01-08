//Write a Java program to check whether a triangle is equilateral(both side are equal) , isoscale(Any to side same) or scalene(bothe 3 size diffrent). 
import java.util.Scanner;
	class EquiIsoSca{
		public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Triangle value:");
		
		int a= sc.nextInt();    
		int b =sc.nextInt();
		int c=sc.nextInt();
		
		String result=(a==b && b==c)? "Equilatral triangle" :(a==b || b==c || a==c) ?"Isoscale triangle":"Scalene triangle";
		System.out.println("THe Triangle is:"+result);
		sc.close();
		
		}
	}