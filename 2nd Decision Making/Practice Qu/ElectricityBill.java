import java.util.Scanner;
class ElectricityBill
{
  public static void main(String[]args)
        {
          int n;
		  int billAmt=0;
          Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Total Units");
            n=sc.nextInt();		  

			if(n<=100)// n<=101
			  {
				billAmt=n*5;
			  }			  
		       else if(n<=200)//n=101 to 200
				{
				  billAmt=100*5+(n-100);
				}
			     else if(n<=300)//n=300
					{
					 billAmt=100*5+100*7+(n-200)*10;
					}
					else 
						{
						  billAmt=100*5+100*7+100*10+(n-300)*15;
						}

						System.out.println("Total Bill is "+billAmt);
        }

}