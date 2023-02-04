import java.util.*;
abstract class Shape {
	int a,b;
	Shape(int x,int y)
	{
		a=x;
		b=y;
	}
	abstract void printArea();
}

class Rectangle extends Shape{
	Rectangle(int x,int y)
	{
		super(x,y);
	}
	void printArea()
	{
		System.out.println("Area of Rectangle:"+(a*b));
	}
}

class Triangle extends Shape{
	Triangle(int x,int y)
	{
		super(x,y);
	}
	void printArea()
	{
		System.out.println("Area of Triangle:"+(0.5*a*b));	
	}
}

class Circle extends Shape{
	Circle(int x)
	{
		super(x,x);
	}
	void printArea()
	{
		System.out.println("Area of Circle:"+(Math.PI*a*b));	
	}
}

class program4 {
	public static void main(String args[])
	{
		Shape s;
		Rectangle r1=new Rectangle(30,40);
		Triangle t1=new Triangle(30,20);
		Circle c1=new Circle(50);
		r1.printArea();
		t1.printArea();
		c1.printArea();
	}
}
