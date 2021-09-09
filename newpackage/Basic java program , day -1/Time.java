package newpackage;

import java.util.Scanner;

public class Time {
	public static void main(String args[])
	{
		int hour , min , sec;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter hour");
		hour = sc.nextInt();
		System.out.println("Enter min");
		min = sc.nextInt();
		System.out.println("Enter sec");
		sec = sc.nextInt();
		
		if(hour>23)
		{
			System.out.print("wrong inpur for hour");
		}

		if(min>=60)
		{
			System.out.print("wrong inpur for min");
		}
		if(sec>=60)
		{
			System.out.print("wrong inpur for sec");
		}
		if(hour>11 && hour<23)
		{
			System.out.println("time is"+ "\t" + hour+":"+min+":"+sec+"PM");
		}
		else
		{
			System.out.println("time is"+ "\t" + hour+":"+min+":"+sec+"AM");
		}
		
	}

}
