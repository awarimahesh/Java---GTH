/*
Example: WAP to create class name as Book with field id,name,author
And Book is POJO class and we have one more class name as Library with two methods 
void setBooks(Book …b): this function is used for  accept book as infinite parameter 
voidi showBook(): this function can display the book 



*/
import java.util.*;

class Book{
	private int id;
	private String name;
	private String author;
	public static void setId(int i){
		id=i
	}
	public int getId(){
		return Id;
	}
	public static void setName(String n){
		name=n;
	}
	public String getName(){
		return name;
	}
	public static void setAuthor(String a){
		author=a;
	}
	public string getAuthor(){
		return author;
	}
}
class Library{
	private Book []book;
	void setBooks(Book …b){
		book=b;
	}
	void showBook(){
	for(int i=0;i<Book.length;i++){
		System.out.println(boo[i].getId()+"\t"boo[i].getName+"\t"+boo[i].getAuthor);
	}
}
}
public class BookPojo{
	public static void main(String args[]){
		Library li=new Library();
		Book b1=new Book();
		b1.setId(1);
		b1.setName("Abc");
		b1.setAuthor("AA");
		
		Book b2=new Book();
		b2.setId(2);
		b2.setName("Ab");
		b2.setAuthor("A");
		
		li.setBook(b1,b2);
		li.showBook();
	}
}
