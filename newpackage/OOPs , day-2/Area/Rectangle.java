package newpackage;
import newpackage.Shape;

public class Rectangle extends Shape {
	double area;
	double breadth=9;
	void area()
	{
		area = length * breadth;
		System.out.println("Area of Rectangle  is: "+" "+ area);
	}
}
