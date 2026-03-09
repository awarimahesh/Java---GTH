/*
Q5. Create a POJO class BookIssue:
bookId (int)
studentName (String)
daysLate (int)
Fine rules:
First 5 days → ₹2 per day
After 5 days → ₹5 per day
Calculate total fine and display details.
Explanation:
Apply fine logic:


If daysLate ≤ 5 → daysLate × 2
Else → (5 × 2) + ((daysLate - 5) × 5)


Display fine amount.


Input:
Enter Book ID: 301
Enter Student Name: Kiran
Enter Days Late: 8
Output:
Book ID: 301
Student Name: Kiran
Days Late: 8
Total Fine: 25

*/
import java.util.*;
class BookIssue{
	private int id;
	private String name;
	private int day;
	
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setDay(int day){
		this.day=day;
	}
	public int getId(){
		return id;
	}
	public  String getName(){
		return name;
	}
	public int getDay(){
		return day;
	}
	
	
}
public class Book{
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter How many book:");
		int no=sc.nextInt();
		BookIssue []bi=new BookIssue[no];
		
		for (int i=0;i<no;i++){
			bi[i]=new BookIssue();
			
			System.out.println("Book id");
			int id=sc.nextInt();
			bi[i].setId(id);
			
			System.out.println("enter student name:");
			String name=sc.next();
			bi[i].setName(name);
			
			System.out.println("Enter book dayuse:");
			int day=sc.nextInt();
			bi[i].setDay(day);
			
			int totaldaylate=bi[i].getDay();
			int finalamount ;
			if(totaldaylate<5){
				finalamount=totaldaylate*2;
			}
			else{
				finalamount=5*2+((totaldaylate-5)*5);

			}
			System.out.println(bi[i].getId());
			System.out.println("Name of student:"+bi[i].getName());
			System.out.println("Days late"+bi[i].getDay());
			System.out.println("Total amount:"+finalamount);
			
		}
	}
}