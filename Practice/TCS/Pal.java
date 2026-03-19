/*
Palindrome Number
*/
class Pal{
	public static void main(String args[]){
		
		int no=121,rev=0;
		int temp=no;
		
		while(no>0){
			rev=rev*10+no%10;
			no=no/10;
		}
		if(temp==rev){
			System.out.println("no is pal");
		}
		else{
			System.out.println("Not pal");
		}
	}
}