package newpackage;

import java.util.Scanner;

public class ReverseWord {
public static void main(String args[])
{
    System.out.println("Enter the String");
    String s = new String();
    
    Scanner sc = new Scanner(System.in);
    
    s = sc.next();
    
    char [] rev = new char[s.length()];
    
    for(int i = s.length()-1; i>=0; i--)
    {
    	rev[s.length()-i-1] = s.charAt(i);
    }
    System.out.println(rev);

/*Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative

Write a Java program to convert seconds to hour, minute and seconds.

Write a Java program to reverse a word.*/
    
}
}
