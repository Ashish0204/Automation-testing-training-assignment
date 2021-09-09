package newpackage;
import newpackage.Shape;

public class Circle extends Shape{
	double area;
	void area()
	{
		area = 3.14f * length * length;
		System.out.println("Area of circle is: "+" "+ area);
	}

}
