/* Q25. Create a class BankTransaction with overloaded methods named transaction().
Method 1: Accepts amount only → deposit
Method 2: Accepts amount + account number → deposit to specific account
Method 3: Accepts amount + account number + transaction type (String) → deposit or withdraw
Display transaction details.
Explanation: This problem shows how method overloading improves readability and flexibility.
Same method name is reused for different transaction requirements.
*/
class BankTransaction{
	public static void main(String args[]){
		
		BankTransaction obj= new BankTransaction();
		
		obj.transaction(5000);
		obj.transaction(3000,1234);
		obj.transaction(2000,1234,"withdraw");
	}
	public static void transaction(int deposit){
		System.out.println("Accepts amount only"+deposit);
	}
	public static void transaction(int accept,int acountNumber){
		System.out.println("Accept amount: " +accept+ "account number : "+acountNumber);
	}
	public static void transaction(int amount ,int AcountNumber ,String type){
	System.out.println("Amount is="+amount+"Acount number is:" +AcountNumber+",Transction :"+type);
	}
}