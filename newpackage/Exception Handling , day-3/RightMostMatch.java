package newpackage;

import java.util.Scanner;

public class RightMostMatch {
public static void main(String args[])
{
	System.out.println("Enter First Number");
	
	Scanner sc = new Scanner (System.in);
	
	int first = sc.nextInt();
	
	System.out.println("Enter second Number");
	int second= sc.nextInt();

	System.out.println("Enter third Number");
	int third= sc.nextInt();
	
	
	if(first%10 == second%10)
	{
		if(first%10==third%10)
		{
			System.out.println("Righmost digit of all number are same");
		}
		else {	
			System.out.println("Righmost digit of First and Second are same but  Third  digit righmost is not equal to any of them");
		}
		
	}
	else if(first%10==third%10)
	{
		System.out.println("Righmost digit of first and third are same");
	}
	else
	{
		System.out.println("Righmost digit of second and third are same");
	}

}



}
