/*Q3. Create a POJO class Product with:
productId
productName
price
Store N products.
 Apply discount:
20% if price > 5000
10% if price ≤ 5000
Display final price after discount.
Explanation:
Store product details in array.
Use loop to calculate discount.
Update price.
Print updated details.
 Input:
Enter number of products: 3

1
Laptop
60000

2
Shoes
4000

3
Watch
7000
Output:
Final Product Details:

1 Laptop 48000.0
2 Shoes 3600.0
3 Watch 5600.0
*/
import java.util.*;
class Product1{
	private int id;
	private String name;
	private int price;
	
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPrice(int price){
		this.price=price;
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
public class Product{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of product:");
		int no=sc.nextInt();
		Product1 []p=new Product1[no];
		
		for(int i=0;i<no;i++){
			p[i]=new Product1();
		
		
		System.out.println("Enter product id :");
		int id=sc.nextInt();
		
		System.out.println("Enter product Name:");
		String name=sc.next();
		
		System.out.println("Enter product Price:");
		int price=sc.nextInt();
		
		p[i].setId(id);
		p[i].setName(name);
		p[i].setPrice(price);
		
		double total=p[i].getPrice();
		double discount;
		if(total>=5000){
			 discount=total*0.15;
		}
		else{
			discount=total*0.10;
		}
		double finalamount=total-discount;
		System.out.println("ID\tName\tPrice\tDiscount\tFinal Price");
		
		System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+total+"\t"+discount+"\t"+finalamount);		
		
	}
}
}
