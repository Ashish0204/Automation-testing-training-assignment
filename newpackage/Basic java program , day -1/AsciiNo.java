package newpackage;

import java.util.Scanner;

public class AsciiNo {
	
	public static void main(String args[]) {
	System.out.println("Enter character");
	Scanner sc = new Scanner(System.in);
	char i = sc.next().charAt(0);
	
	int Ascii = i;
	int castAscii = (int)i;
	
System.out.println("ASCII value of"+ " " +i+  " " +"is"+ " " +castAscii);
}
}
