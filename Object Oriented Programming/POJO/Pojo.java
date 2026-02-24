/*
Pojo
*/
class Department{
	private int id;
	private String name;
	private long Salary;
	
	void addNewEmp(int i,String na,long sal){
		id=i;
		name=na;
		Salary=sal;
	}
	void showEmp(){
		System.out.println(id+"\t"+name+"\t"+Salary+"\t");
	}
}
public class Pojo{
public static void main(String args[]){
	
	Department d=new Department();
	d.addNewEmp(1,"Mahesh",100000L);
	d.showEmp();
	
}
}
