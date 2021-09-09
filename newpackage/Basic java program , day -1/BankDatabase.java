package newpackage;
import java.util.Scanner;

public class BankDatabase {
	
	
	static int Amount ;
	
	
	public static void main(String args[])
	{
		System.out.println("enter the Amount");
		Scanner sc = new Scanner(System.in);
		Amount = sc.nextInt();
		do {
			System.out.println("press 1 for Deposit");
			System.out.println("press 2 for withdraw");
			System.out.println("press 3 for GetBalance");
			System.out.println("press 4  to  continue");
			
			int option = sc.nextInt();
			boolean i=false;
								
			switch(option)
			{
			case 1:  deposit();
			         break;
			case 2:  withdraw();
			        break;
			case 3:  getbalance();
		             break;
			case 4: i= true;  
			            break;
		    default: System.out.println("you Entered wrong option"); 
			}
		}
		while(true);	
		
	}
	
	
	
	static void deposit()
	{
		System.out.println("Enter the value to be deposited");
		Scanner sc = new Scanner(System.in);
		int deposit = sc.nextInt();
		Amount = Amount + deposit;
		
		System.out.println("Amount Deposited =" + "\t"+ deposit);
		System.out.println("Total Amount =" + "\t"+ Amount);
		
	}
	static void withdraw()
	{
		
		System.out.println("Enter the value to be deposited");
		Scanner sc = new Scanner(System.in);
		int wd = sc.nextInt();
		
		if(Amount<wd) {
			System.out.println("Amount can't withdrawn ! amount not present");
		}
		else {
		Amount = Amount - wd;
		
		System.out.println("Amount Deposited =" + "\t"+ wd);
		System.out.println("Total Amount =" + "\t"+ Amount);
		}
		
	}
	static void getbalance()
	{
		System.out.println("Current Balace : "+ "\t"+Amount);
		
	}
}
