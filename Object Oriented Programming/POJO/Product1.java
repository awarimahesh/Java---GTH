/*
Example: Suppose consider we have class name as Product class  
with field id,name and price and we have one more class name as 
Shop with two methods 

void setProduct(Product p): this method can accept Product data 
void showProduct(): this method can display the product details 

*/
import java.util.*;
class product{
	private int id;
	private String name;
	private int price;
	
	public void  setId(int i){
		id=i;
	}
	public void setName(String n){
		name=n;
	}
	public void setPrice(int p){
		price=p;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getPrice(){
		return price;
	}
	
}
class Shop{
	Product []prod;
	void setProduct(Product ...p){
		prod=p;
	}
	void showProduct(){
		for(int i=0;i<prod.length;i++){
			 System.out.println(prod[i].getNmae()+"\t"
			 +prod[i].getId()+"\t"+prod[i].getPrice());
		}
		
	}
	
}
public class Product1{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	Product1 prod1=new Product1();
	prod1.setid(1);
	prod1.setname("mahesh");
	prod1.setprice(234);
	
	Product prod2=new Product();
	prod1.setid(2);
	prod1.setname("mangesh");
	prod1.setprice(2343);
	
	Product prod3=new Product();
	prod1.setid(3);
	prod1.setname("PQR");
	prod1.setprice(2340);
	
	Shop s= new Shop();
	s.setProduct(prod1,prod2,prod3);
	s.showProduct();
	}
}