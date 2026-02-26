/*
Employee
*/
import java.util.*;
class Employee{
	private int id;
	private String name;
	private int sal;
	
	public void setId(int i){
		id=i;
	}
	public int getId(){
		return id;
	}
	public void setName(String n){
		name=n;
	}
	public  String getName(){
		return name;
	}
	public void setSal(int s){
		sal=s;
	}
	public  int getSal(){
		return sal;
	}
	
}
public class  Pojoemp{
	public static void main(String args[]){
		Employee emp[] =new Employee[5]; 
		for(int i=0;i<emp.length;i++){
			Scanner sc= new Scanner(System.in);
			emp[i]=new Employee();
			System.out.println("Enter employe id name snad salary:");
			int id=sc.nextInt();
			String name=sc.next();
			int sal=sc.nextInt();

			 
			 //System.out.println("Enter employe id");
			 emp[i].setId(id);
			 //System.out.println("Enter emp name:");
			 emp[i].setName(name);
			 //System.out.println("Enter salary:");
			 emp[i].setSal(sal);
		}
		System.out.println("Employeee:");
		for(int i=0;i<emp.length;i++){
		System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSal());
	}
	}
	
}