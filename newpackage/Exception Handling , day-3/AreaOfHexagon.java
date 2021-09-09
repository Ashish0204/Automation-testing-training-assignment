package newpackage.Marks;

import java.util.Scanner;

public class AreaOfHexagon {
public static void main(String args[])
{
	System.out.println("Enter the side of hexagon");
	
	Scanner sc = new Scanner(System.in);
     int s =  sc.nextInt();
     
     double area ;
     
     area = ((3*1.732)/2)*s*s;
     
     System.out.println("area of hexagon is :"+" "+ area);
}
}
