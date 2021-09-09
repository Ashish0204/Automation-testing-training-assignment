package newpackage;

import java.util.Scanner;

public class StringToInteger {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s = new String();
		s = sc.next();
		
		System.out.println(s.charAt(0));
		int num=0 ;
		for(int i = 0; i<s.length(); i++)
		{
			num = num*10 + s.charAt(i)- 49+1;
		}
		
		System.out.println(num);
	}

}
