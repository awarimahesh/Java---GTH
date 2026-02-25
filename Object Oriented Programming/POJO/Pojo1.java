import java.util.*;
class Department{
	private int ID;
	private long Salary;
	private String Name;
	private String Address;
	
	public void setID(int i){
		ID=i;
	}	
	public int getID(){
		return ID;
	}

	public void setSalary(long sal){
		Salary=sal;
	}
	public long getSalary(){
		return Salary;
	}

	public void setName(String n){
		Name=n;
	}
	public String getName(){
		return Name;
	}
	
	public void setAddress(String a){
    Address = a;
}

public String getAddress(){
    return Address;
}
}
	class Employee{
		private Department department;
		void addNewDepartment(Department dep){
			department=dep;
		}
		void showDepartment(){
			System.out.println(department.getID()+"\t"+department.getSalary()+"\t"+department.getName()+"\t"+department.getAddress());
		}
	}

public class Pojo1{
	public static void main(String args[]){
		Employee emp=new Employee();
		Department dep=new Department();
		dep.setSalary(10000L);
		dep.setID(1);
		dep.setName("Mahesh");
		dep.setAddress("Pune");
		
		emp.addNewDepartment(dep);
		emp.showDepartment();
	}
}