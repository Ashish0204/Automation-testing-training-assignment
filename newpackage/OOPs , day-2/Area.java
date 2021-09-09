package newpackage;
import java.util.*;


abstract class Shape1 {
	double length= 5;
	abstract void area();
}

class Square1 extends Shape1
{
	double area;
	void area()
	{
		area = length * length;
		System.out.println("Area of Square is: "+" "+ area);
	}
}
class Rectangle1 extends Shape1
{
	double area;
	double breadth;
	void area()
	{
		System.out.println("Enter  Breadth:");
		Scanner sc = new Scanner(System.in);
		breadth = sc.nextDouble();
		area = length * breadth;
		System.out.println("Area of rectangle is: "+" "+ area);
	}
}

class Circle1 extends Shape
{
	double area;
	void area()
	{
		area = 3.14f *length * length;
		System.out.println("Area of Circle is: "+" "+ area);
	}
}
 public class Area
{
	
  strictfp	public static void main (String [] args) {
	  
	  do {
		
	Circle1 c = new Circle1();
			c.area();
	
	Square1 s= new Square1();
			s.area();
	Rectangle1 r = new Rectangle1();
	r.area();
		
	}
	  while(true);
  }
  
	  
		
		
}