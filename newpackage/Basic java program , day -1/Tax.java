package newpackage;

import java.util.Scanner;

public class Tax {
	
public static void main(String args[])
{
	System.out.println("Enter earning of an Employee");
	Scanner sc = new Scanner(System.in);
	int earn = sc.nextInt();
	float rate = 0f;
	if(earn<=50000) {
		System.out.println("Income tax paid by employee is NIL");
	}
	else if(earn == 60000)
	{
		System.out.println("income tax paid by employee is:"+"\t"+ 6000);
	}
	else if(earn < 60000)
	{
		 rate = ((60000-earn)*10)/100;
	}
	else if(earn == 150000)
	{
		System.out.println("income tax paid by employee is:"+"\t"+ 15000);
	}
	else if(earn < 150000)
	{
		rate = ((150000 - earn)*20)/100;
	}
	else if(earn > 150000)
	{
		 rate = ((earn-150000)*30)/100;
	}
	else {
		System.out.println("amount not entered");
	}
	System.out.println("income tax paid by employee is:"+"\t"+ rate);
}
}
