package newpackage;

import java.util.Scanner;

public class Add {

	public static void main(String args[])
	{
		System.out.println("Enter first no");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		System.out.println("Enter first no");
		int j = sc.nextInt();
		
		System.out.println("sum of two no is"+"\t"+(i+j));
	}
}
