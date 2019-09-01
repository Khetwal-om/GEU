class InnerClassDemo{
	public static void main(String[] args) {

		OuterClass ob=new OuterClass();
		ob.test();
	}
}


class OuterClass
{


	int outer_x=11;


    void test()
	{
		Inner obj=new Inner();
		obj.display();
		System.out.println();
	}

	class Inner
	{
		void display()
		{
			System.out.println("Display of Inner class"+outer_x);
		}
	}
}