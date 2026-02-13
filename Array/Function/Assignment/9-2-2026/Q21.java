/*
Q21. Create a class StudentMarks that has overloaded methods 
named calculateMarks() to calculate total marks.
	Method 1: Accepts 3 integers (marks of 3 subjects)
	Method 2: Accepts 4 integers (marks of 4 subjects)
	Method 3: Accepts 5 integers (marks of 5 subjects)
	Each method should return the total marks.
Explanation: This question focuses on method overloading based on 
number of parameters.
        All methods have the same name but accept different counts
		of arguments. Java decides which method to call at compile time.

*/
class Q21{
	public static void main(String args[]){
		
		int result1=alculateMarks(10,20,30);
		System.out.println(""+result1);
		
		int result2=alculateMarks(10,20,30,40);
		System.out.println(""+result2);
		
		int result3=alculateMarks(10,20,30,40,50);
		System.out.println(""+result3);
		
		
		
	}
	public static int alculateMarks(int x,int y,int z){
		return x+y+z;
	}
	public static int alculateMarks(int l,int m,int n,int o){
		return l+m+n+o;
	}
	public static int alculateMarks(int p,int q,int r,int s,int t){
		return p+q+r+s+t;
	}
	
}