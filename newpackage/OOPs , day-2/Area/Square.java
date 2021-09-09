package newpackage;
import newpackage.Shape;

public class Square extends Shape{
	double area;
	void area()
	{
		area = length * length;
		System.out.println("Area of Square is: "+" "+ area);
	}

}
