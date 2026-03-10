/*
Q6. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. 
Store details of 5 employees using an array of objects. Perform the following operations:
Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all 
employees.


Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations 
and finding max/average values.
*/
import java.util.*;

class Employee{
    private int empid;
    private String name;
    private int basicsalary;
    private int hra;
    private int da;

    public void setEmpid(int empid){
        this.empid = empid;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBasicsalary(int basicsalary){
        this.basicsalary = basicsalary;
    }

    public void setDa(int da){
        this.da = da;
    }

    public void setHra(int hra){
        this.hra = hra;
    }

    public int getEmpid(){
        return empid;
    }

    public String getName(){
        return name;
    }

    public int getBasicsalary(){
        return basicsalary;
    }

    public int getDa(){
        return da;
    }

    public int getHra(){
        return hra;
    }

    double getGrosssalary(){
        return basicsalary + da + hra;
    }

    void display(){
        System.out.println(empid + " " + name + " Gross Salary: " + getGrosssalary());
    }
}

public class Q6{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees:");
        int no = sc.nextInt();

        Employee emp[] = new Employee[no];

        for(int i = 0; i < no; i++){

            emp[i] = new Employee();

            System.out.println("Enter employee id:");
            int id = sc.nextInt();

            System.out.println("Enter name:");
            String name = sc.next();

            System.out.println("Enter basic salary:");
            int basicsalary = sc.nextInt();

            System.out.println("Enter DA:");
            int da = sc.nextInt();

            System.out.println("Enter HRA:");
            int hra = sc.nextInt();

            emp[i].setEmpid(id);
            emp[i].setName(name);
            emp[i].setBasicsalary(basicsalary);
            emp[i].setDa(da);
            emp[i].setHra(hra);
        }

        double totalsalary = 0;

        for(int i = 0; i < emp.length; i++){
            totalsalary += emp[i].getGrosssalary();
        }

        double avgsalary = totalsalary / emp.length;

        Employee maxEmp = emp[0];

        for(int i = 1; i < emp.length; i++){
            if(emp[i].getGrosssalary() > maxEmp.getGrosssalary()){
                maxEmp = emp[i];
            }
        }

        System.out.println("\nEmployee with Maximum Salary:");
        maxEmp.display();

        System.out.println("\nEmployees with Salary greater than Average:");

        for(int i = 0; i < emp.length; i++){
            if(emp[i].getGrosssalary() > avgsalary){
                emp[i].display();
            }
        }
    }
}