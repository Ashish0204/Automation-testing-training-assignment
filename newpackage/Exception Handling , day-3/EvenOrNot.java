package newpackage.Marks;

import java.util.Scanner;

public class EvenOrNot {
	public static void main(String args[])
	{
		System.out.println("Enter a Number");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("1");
			
		}
		else 
		{
			System.out.println("0");
		}
	}

}
