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
		retrn id;
		
	}
	public String getName(){
		return name;
	}
	public int getPrice(){
		return price;
	}
}
public class product{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		product1 p=new Product1();
		
		Sytem.out.println("Enter product id :");
		int id=sc.nextInt();
		
		System.out.println("Enter product Nmae:");
		String name=sc.next();
		
		System.out.println("Enter product Prixe:");
		int price=sc.nextInt();
		
		p.setId(id);
		p.setNmae(name);
		p.setPrice(price);
		
		if(s.getPrice()>=5000){
			int price=price-(price*20)/100;
		}
		
	}
}
