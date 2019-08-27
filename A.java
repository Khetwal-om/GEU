public class A
{
	public static void main(String args[])
	{
		B obj=new B();
		obj=new B();
	}
}


class B
{
	int i;

	void B()
	{
		System.out.println("this is method B");
	}
}