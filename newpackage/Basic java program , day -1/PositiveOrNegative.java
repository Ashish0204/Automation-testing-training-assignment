package newpackage;

import java.util.Scanner;

public class PositiveOrNegative {
	
public static void main(String args[]) {
	int i;
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	
	i = sc.nextInt();
	if(i>0)
	System.out.println("positive NO");
	else if(i==0)
	{
		System.out.println("number is zero");
	}
	else {
		System.out.println("Negative NO");
		
	}
}

}
