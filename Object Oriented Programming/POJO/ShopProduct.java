/*
Example: Suppose consider we have class name as Product class  
with field id,name and price and we have one more class name as 
Shop with two methods 

void setProduct(Product p): this method can accept Product data 
void showProduct(): this method can display the product details 

*/
import java.util.*;
class Product{
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
			 System.out.println(prod[i].getId()+"\t"+prod[i].getName()+"\t"+prod[i].getPrice());
		}
		
	}
	
}
public class ShopProduct{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	Product prod1=new Product();
	prod1.setId(1);
	prod1.setName("mahesh");
	prod1.setPrice(234);
	
	Product prod2=new Product();
	prod2.setId(2);
	prod2.setName("mangesh");
	prod2.setPrice(2343);
	
	Product prod3=new Product();
	prod3.setId(3);
	prod3.setName("PQR");
	prod3.setPrice(2340);
	
	Shop s= new Shop();
	s.setProduct(prod1,prod2,prod3);
	s.showProduct();
	}
}