/*Q24. Create a class MessagePrinter with overloaded methods named printMessage().
Method 1: Accepts one String → print a simple message
Method 2: Accepts String + int → print message with number of times
Method 3: Accepts String + String → print sender name and message
Explanation: This question demonstrates overloading with different parameter combinations.
Order and type of parameters matter in method overloading.
*/
class Q24{
public static void main(String args[]){
	Q24 obj= new Q24();
	 obj.printMessage("mahesh");
	 obj.printMessage("Welcome",3);
	 obj.printMessage("mahesh","good morning");
	}
	public static void printMessage(String massage){
		System.out.println(""+massage);
	}
	public static void printMessage(String massage,int time){
		for(int i=1;i<=time;i++){
		System.out.println(""+massage);
		}
		
	}
	public static void printMessage(String sender,String massage){
		System.out.println(sender+""+massage);
	}
}
