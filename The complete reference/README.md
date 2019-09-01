# 6 Class
---

1.  A class is a template for an object, and an object is an instance of a class. Because an object is an instance of a class.

2. Variables defined within a class are called instance variables because each instance of the class (that is, each object of the class) contains its own copy of these variables. Thus, the data for one object is separate and unique from the data for another.

```java
class BoxDemo
{
	public static void main(String[] args) {
		Box obj=new Box();
		obj.width=10;
		obj.height=20;
		obj.length=30;
		double vol=obj.width*obj.height*obj.length;
		System.out.println("Volume"+vol);
	}
}

class Box
{
	double width;
	double height;
	double length;
}

Volume6000.0

```

3. The new operator dynamically allocates (that is, allocates at run time) memory for an object and returns a reference to it. This reference is, more or less, the address in memory of the object allocated by new. This reference is then stored in the variable. Thus, in Java, all class objects must be dynamically allocate

```java
Box mybox; // declare reference to object
mybox = new Box(); // allocate a Box object 
```

4.  obj and obj_a refer to same object but they ain't linked. obj=null will unhook obj from original
   object without affecting obj_a. __Copy of the reference ,not copy of the reference__


```java
class BoxDemo
{
	public static void main(String[] args) {
		Box obj=new Box();
		Box obj_a=obj;// means copy of the reference ,not copy of the reference

		obj.width=10;
		obj.height=20;
		obj.length=30;
		double vol=obj.width*obj.height*obj.length;
		System.out.println("Volume"+vol);
		System.out.println(obj_a.width);
		System.out.println(obj_a.length);System.out.println(obj_a.height);

		obj=null;
		System.out.println(obj_a.width);
		System.out.println(obj_a.length);System.out.println(obj_a.height);



	}
}

class Box
{
	double width;
	double height;
	double length;
}

```

5.  A parameter is a variable defined by a method that receives a value when the method is called. For example, in square(int i), i is a parameter. An argument is a value that is passed to a method when it is invoked. For example, square(100) passes 100 as an argument. Inside square( ), the parameter i receives that value. 

6. Constructor

> The implicit return type of a class’ constructor is the class type itself.It is the\
 constructor’s job to initialize the internal state of an object so that the code creating an instance \
will have a fully initialized, usable object immediately.

```java
class BoxDemo
{
	public static void main(String[] args) {
		Box obj=new Box(10,20,30);
		double vol=obj.volume();
		System.out.println(vol);
	}
}

class Box
{
	double width;
	double height;
	double length;

	Box(double width,double height,double length)
	{
		System.out.println("Hola ahi");
		this.width=width;
		this.height=height;
		this.length=length;
		System.out.println(width);
		System.out.println(height);
		System.out.println(length);
	}
	double volume()
	{
		return width*height*length;
	}
}

Hola ahi
10.0
20.0
30.0
6000.0

```

* The difference

__Instance Variable Hiding__ As you know, it is illegal in Java to declare two local variables with the same name inside the same or enclosing scopes. Interestingly, you can have local variables, including formal parameters to methods, which overlap with the names of the class’ instance variables. However, when a local variable has the same name as an instance variable, the local variable hides the instance variable. This is why width, height, and depth were not used as the names of the parameters to the Box( ) constructor inside the Box class. If they had been, then width, for example, would have referred to the formal parameter, hiding the instance variable width. While it is usually easier to simply use different names, there is another way around this situation. Because this lets you refer directly to the object, you can use it to resolve any namespace collisions that might occur between instance variables and local variables. For example, here is another version of Box( ), which uses width, height, and depth for parameter names and then uses this to access the instance variables by the same name:


```java

class BoxDemo
{
	public static void main(String[] args) {
		Box obj=new Box(10,20,30);
		double vol=obj.volume();
		System.out.println(vol);
	}
}

class Box
{
	double width;
	double height;
	double length;

	Box(double width,double height,double length)
	{
		System.out.println("Hola ahi");
		width=width;
		height=height;
		length=length;
		System.out.println(width);
		System.out.println(height);
		System.out.println(length);
	}
	double volume()
	{
		return width*height*length;
	}
}


Hola ahi
10.0
20.0
30.0
0.0
```

7. __Overloading Methods In Java__
 It is possible to define two or more methods within the same class that share the same name, as long as their parameter declarations are different. When this is the case,  the methods are said to be overloaded, and the process is referred to as method overloading.
 Method overloading is one of the ways that Java supports polymorphism.

> When an overloaded method is invoked, Java uses the type and/or number of arguments as its guide to determine which version of the overloaded method to actually call. Thus, overloaded methods must differ in the type and/or number of their parameters.\
 While overloaded methods may have different return types, __the return type alone is insufficient to distinguish two versions of a method__.\
 When Java encounters a call to an overloaded method, it simply executes the version of the method whose parameters match the arguments used in the call. \
 When an overloaded method is called, Java looks for a match between the arguments used to call the method and the method’s parameters.


```java
class Overload
{
	public static void main(String[] args) {
		OverloadDemo obj=new OverloadDemo();
		obj.test();
		obj.test(7);
		obj.test(10,11);
		obj.test(3.14);
	}
}

class OverloadDemo
{
   void test()
   {
     System.out.println("This is the test method without any argument");
   }

   void test(int i)
   {
   	System.out.println("This is the test with one argument"+i);
   }


   void test(int i,int k)
   {
   	System.out.println("This is the test with two arguments"+i+k);
   }

   double test(double i)
   {
   	System.out.println("This is the test with one argument but of double type and return type is also double"+i);
   	return i;
   }
}

// This is the test method without any argument
// This is the test with one argument7
// This is the test with two arguments1011
// This is the test with one argument but of double type and return type is also double3.14

```

> When an overloaded method is called, Java looks for a match between the arguments used to call \
the method and the method’s parameters. However, this match need not always be exact. In some \
cases, Java’s automatic type conversions can play a role in overload resolution


8.  __Constructor Overloading__


```java
class BoxDemo
{
	public static void main(String[] args) {

	Box obj=new Box();
	System.out.println("Without"+obj.volume());  //Without-1.0

	Box obj_b=new Box(10,20,30);
	System.out.println("With three arguments"+obj_b.volume()); //With three arguments6000.0

	Box obj_c=new Box(11);
	System.out.println("With single"+obj_c.volume());  //With single1331.0		
	}
}

class Box
{
	double height;
	double width;
	double length;

	Box(double height,double width,double length)
	{
		this.height=height;
		this.width=width;
		this.length=length;
	}

	Box()
	{
		height=width=length=-1;
	}

	Box(double value)
	{
		height=width=length=value;
	}

	double volume()
	{
		return height*width*length;
	}
}


```

9. __Using objects as parameters__

```java
class TestDemo
{
	public static void main(String[] args) {

		Test obj_a=new Test(10,20);
		Test obj_b=new Test(7,11);
		System.out.println(obj_a.isEqual(obj_b));  //false


		Test obj_c=new Test(10,20);
		System.out.println(obj_c.isEqual(obj_b)); //false


		System.out.println(obj_c.isEqual(obj_a));  //true

		System.out.println(obj_a.isEqual(obj_c));  //true
}

}

class Test
{
	int a;
	int b;

	Test(int j,int k)
	{
		a=j;
		b=k;
	}

	boolean isEqual(Test o)
	{
		if (a==o.a && b==o.b)
			return true;
		else
			return false;
	}
}

```

10. One object can initialize another one

```java
class BoxDemo
{
	public static void main(String[] args) {

		Box obj=new Box(10,20,30);
		obj.volume();     // the volume is 6000.0

		Box obj_b=new Box(obj);
		obj_b.volume();  // the volume is 6000.0

	}
}

class Box
{
	double width;
	double height;
	double length;

	Box(double w,double h,double l)
	{
		width=w;
		height=h;
		length=l;
	}

	Box(Box ob)
	{
		width=ob.width;
		height=ob.height;
		length=ob.length;
	}

	void volume()
	{
		System.out.println("The volume is "+width*height*length);
	}
}


```


11. Call by reference and call by value

   1. Call by value 
  
  ```java
class TestDemo
{
	public static void main(String[] args) {
      Demo obj=new Demo();

      int i=10;
      int j=11;
      System.out.println("Value of i and j before calling alter"+i+"  "+j);
      obj.alter(i,j);


      System.out.println("Value of i and j after calling alter"+i+"  "+j);
     

	}
}

class Demo
{
   void alter(int i,int j)
   {
   	i=i*2;
   	j=j+2;

   	System.out.println("This is within the function");
    System.out.println("Value of i and j after when contorl is within alter"+i+"  "+j);


   }
}

// Value of i and j before calling alter10  11
// This is within the function
// Value of i and j after when contorl is within alter20  13
// Value of i and j after calling alter10  11


  ```

   2. Call by reference

   ```java

class TestDemo
{
	public static void main(String[] args) {
      Demo obj=new Demo(10,11);

      System.out.println("Value of a and b before calling constructor"+obj.a+"  "+obj.b);
      
      obj.alter(obj);
      
      System.out.println("Value of a and b after calling alter"+obj.a+"  "+obj.b);
     

	}
}

class Demo
{
	int a,b;
   Demo (int i,int j)
   {
   		a=i;
   		b=j;

   }

   void  alter(Demo obj)
   {
   	obj.a=obj.a*2;
   	obj.b=obj.b+2;

   	System.out.println("This is within the function");
    System.out.println("Value of i and j after when contorl is within alter"+obj.a+"  "+obj.b);


   }


}

// Value of a and b before calling constructor10  11
// This is within the function
// Value of i and j after when contorl is within alter20  13
// Value of a and b after calling alter20  13


   ```


10. __Returning objects__

```java

```


11. __static__

 1. There will be times when you will want to define a class member that will be used independently of any object of that class. Normally, a class member must be accessed only  in conjunction with an object of its class. However, it is possible to create a member that can  be used by itself, without reference to a specific instance.
 2. To create such a member, precede  its declaration with the keyword static. When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object. 
 3. The most common example of a static member is main( ). main( ) is declared as static because it must be called before any objects exist. Instance variables declared as static are, essentially, global variables.
 4. When objects of  its class are declared, no copy of a static variable is made. Instead, all instances of the class share the same static variable.
 5.  Methods declared as static have several restrictions: 
    • They can only directly call other static methods.
    • They can only directly access static data. 
    • They cannot refer to this or super in any way. (The keyword super relates to inheritance and is described in the next chapter.) 
 6. If you need to do computation in order to initialize your static variables, you can declare a static block that gets executed exactly once, when the class is first loaded.


 12. Demonstrate static block,method and variable

 ```java
class StaticDemo{
	public static void main(String[] args) {
		Demo obj=new Demo();
		Demo.display();

	}
}


class Demo
{
	static int i;
	static int b;

	static 
	{
		System.out.println("We can make a static block too");
		i=7;
	}

	static void display()
	{
		System.out.println("value of i"+i);
		System.out.println(b);
	}
}
 ```

13. __final__ :
A field can be declared as final. Doing so prevents its contents from being modified, making it, essentially, a constant. This means that you must initialize a final field when  it is declared. You can do this in one of two ways
> First, you can give it a value when it is declared.\
 Second, you can assign it a value within a constructo




14. __Nested or Inner class__ : It is possible to define a class within another class; such classes are known as nested classes. The scope of a nested class is bounded by the scope of its enclosing class. Thus, if class B is defined within class A, then B does not exist independently of A.
> A nested class has access to the members, including private members, of the class in which it is nested. However, the enclosing class does not have access to the members of the nested class.\
 A nested class that is declared directly within its enclosing class scope is a member of its enclosing class. It is also possible to declare a nested class that is local to a block.\
  There are two types of nested classes: static and non-static. \
  A static nested class is one  that has the static modifier applied. Because it is static, it must access the non-static members of its enclosing class through an object. That is, it cannot refer to non-static members of its enclosing class directly. Because of this restriction, static nested classes are seldom used. \
  The most important type of nested class is the inner class. An inner class is a non-static nested class. It has access to all of the variables and methods of its outer class and may refer to them directly in the same way that other non-static members of the outer class do.\
   The following program illustrates how to define and use an inner class. The class named Outer has one instance variable named outer_x, one instance method named test( ), and defines one inner class called Inner.



```java

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
```
* In the program, an inner class named Inner is defined within the scope of class Outer. Therefore, any code in class Inner can directly access the variable outer_x.
> An instance method named display( ) is defined inside Inner. This method displays outer_x on the standard output stream. \
The main( ) method of InnerClassDemo creates an instance of class Outer and invokes its test( ) method. That method creates an instance of class Inner and the display( ) method is called.\
 It is important to realize that an instance of Inner can be created only in the context of class Outer. The Java compiler generates an error message otherwise. \
 In general, an inner class instance is often created by code within its enclosing scope, as the example does. As explained, an inner class has access to all of the members of its enclosing class, but the reverse is not true. Members of the inner class are known only within the scope of the inner class and may not be used by the outer class.



 ```java
 // This program will not compile. 
 class Outer {   

  int outer_x = 100; 

  void test() 
  {  
     Inner inner = new Inner(); 
     inner.display();   
   } 
 
  // this is an inner class 
    class Inner {


   int y = 10; // y is local to Inner 
 
    void display() 
    { 
          System.out.println("display: outer_x = " + outer_x);  
    }  
  
    } 
 
  void showy() { 
      System.out.println(y); // error, y not known here!
         } 
     } 
 
class InnerClassDemo 
{   public static void main(String args[])
 { 
     Outer outer = new Outer();   
       outer.test();
          }

  }

```




---