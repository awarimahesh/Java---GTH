/*
Prime Number
*/
class P{
	public static void main(String args[]){
			int no= 999;
			boolean isPrime=true;
			if(no%2!=0){
				isPrime=false;
			}
			System.out.println(isPrime?"prime":"not prime");
	}
}