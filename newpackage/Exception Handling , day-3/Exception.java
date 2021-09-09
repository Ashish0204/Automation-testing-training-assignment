package newpackage.Marks;

import java.util.Scanner;

public class Exception {
	
	public static void main(String args[])
	{
	  System.out.println("Enter an Integer");
	  int n;
	  
	  
	  Scanner sc = new Scanner(System.in);
	  n= sc.nextInt();
	  
	  int temp = n;
	  int rem , sum=0;
	  
	  while(temp!=0)
	  {
		  rem = temp % 10 ;
		  
		  sum = sum + rem;
		  
		  temp = temp/10;
		  
	  }
	  System.out.println("Sum of integer :" + n + " "   +   "is " + sum + " ");
	}

}
