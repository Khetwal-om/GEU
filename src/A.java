
class A
{
	public static void main(String args[])
	{
       B obj=new B(10);
       B obj_b=new B();

	}
}


class B extends C
{
  B()
  {
  	super(10);
  	System.out.println("This is th econstructor of B without any argument but calling C's cons with 1 argument using super");
  }

  B(int x)
  {
  	super(x,x);
 	System.out.println("This is th econstructor of B with one  argument but calling C's cons with 2 argument using super");

  }
}



class C
{
 
 C(int x)
 {
 	System.out.println("Constructor of Class C with one argument");
 }

 C(int x,int y)
 {
 	System.out.println("Constructor of class C with two arguments");
 }

}



// Constructor of class C with two arguments
// This is th econstructor of B with one  argument but calling C's cons with 2 argument using super
// Constructor of Class C with one argument
// This is th econstructor of B without any argument but calling C's cons with 1 argument using super
