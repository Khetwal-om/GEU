abstract class Figure 
{
	double dim1;
	double dim2;


	Figure(double a,double b)
	{
		dim1=a;
		dim2=b;
	}

	abstract double area();
}

class Rectangle extends Figure
{
	Rectangle(double a,double b)
	{
		super(a,b);

	}

	double area()
	{
		System.out.println("Rectanlge class");
		return dim1*dim2;
	}
}

class Triangle extends Figure
{
	Triangle(double a,double b)
	{
		super(a,b);
	}

	double area()
	{
		System.out.println("Triangle class");
		return dim1*dim2/2;
	}
}

class AbstractClass
{
	public static void main(String[] args) {
		Rectangle robj=new Rectangle(10,7);

		Triangle tobj=new Triangle(11,11);

		Figure ref;

		ref=robj;

		System.out.println(ref.area());

		ref=tobj;
		System.out.println(ref.area());
	}
}