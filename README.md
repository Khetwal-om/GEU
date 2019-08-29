# Java

---

### Day 1:

---

1 Execution of java program is two phase process
> Compilation \
> Execution

   * Inorder to compile a java program a machine should consist compiler that is part of JDK.
  
2 We can write a number of classes within a source.

3 A class is a template and can be created using 

```java
class className
{
    
}
```

4 Data type
   
    1. primitive.
    2. Abstract,reference,user-defined.

---

5 Java is case sensitive language while dos isn't. 
   > If we have two java class with b.java and B.java ,one of them after compilation will override other.
   
   
6 After successfully compiling a program in class file . It can be executed by java interpreter. A java class
  file is intermediate machine code. (16 bit unicode character is comprehended by JVM).
  
7 __JDK__ 
> __javac__ -> class file (byte code). This byte code can __run__ in another device too.\
> __JRE__   
          
  * java interpreter (JVM)
  * API libraries
   
      


# College

---

1.  We can call an instance method from the constructor.

```java
public class A
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.B();
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
```



2. We can't declare two objects with the same name but can call it.

```java

public class A
{
	public static void main(String args[])
	{
		B obj=new B();
		B obj=new B();
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

A.java:6: error: variable obj is already defined in method main(String[])
                B obj=new B();
                  ^
1 error
```

> Can do this


```java
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
```

3. We can initialize variable of class through block also.

```java
public class A
{
	public static void main(String args[])
	{
		B obj=new B();
		System.out.println("The value o f i"+obj.i);

	}
}


class B
{
	int i;

	{
		i=230;
	}
}
```

> We can create a block in a class using {} ,there may be multiple blocks in a class.


4.








5. Static variable vs instance variable

```java
class Glen
{
	public static void main(String args[])
	{
		James obj=new James();
		James obj_b=new James();
		James.j=7;
		System.out.println(obj.j+"value of j using obj");
		obj.i=2;
		System.out.println(obj.i+"Value of instance variable i of obj");
		obj_b=21;
		System.out.println(obj_b.i+"value of instance variable i of obj_b");
		System.out.println("The value of j static variable using obj object"+obj.j);
		System.out.println("The value of j static variable using obj_b object"+obj_b.j);
		System.out.println("The value of j static variable using class name"+James.j);
		
		
	}
}

class James
{
	int i;
	static int j;
}
```


6.  Static variable concept

```java
class A
{
	int i;
	public static void main(String args[])
	{
		A a=new A();
		i=30;
		System.out.println(i);
		System.out.println("This is the i of the class"+a.i);
	}
}

class B
{
   int i=9;
   static int j=99;

}




```


> Another one

```java
class A
{
	int i;
	static int j=7;
	{
		System.out.println("static");
	}
	public static void main(String args[])
	{
		A a=new A();
		A obj=new A();
	}
}

class B
{

}




```

* We can create a block in a class using {}
> There may be multiple blocks in a class . A block will be copied into each constructor
  call  \
> The block is copied at time of constructor call.


```java

class B
{
    int i;
    {
        System.out.println(i);
        i=7;
    }
    
    B()
    {
        System.out.println(i);
        i=43;
    }
}

class A
{
    public static void main(String args[])
    {
        B obj=new B();
        System.out.println(obj.i);
    }
}
```


* We can initialize a variable at time of declaration it is called instance initialization.
* We can create a class variable if we are using static keyword with a variable.
* We can initialize a class variable as we are initializing instance variable.
* Difference b/w class and instance variable.
> Class variable is associated with class as well as with instance while instance 
 variable is associated with instance only.
 
---

* We cannot use instance variables or non-static things in static context.

> This is the wrong approach.
```java
class B
{
    int i=9;
    static int j=7;
    static int k=i;
}
```

> This is the correct one.
```java
class B
{
    int i=9;
    static int j=99;
    int k=j;
}
```

---

* As we are creating normal block , we can create static block too.
  Static blocks are associated with class means when a class will be loaded in memory
  its static block also be loaded but only once. Static blocks ain't copied into constructor.


---




# August 29

---

1. Constructor overloading

   * If the name of class where main method exists is public then the name of the file should be similar to
    the name of the class otherwise you can name it anything(file).
constructor_overloading.java:1: error: class Area is public, should be declared in a file named Area.java
public class Area
       ^
1 error


```java


```


---



2. 

```java
class A
{
	public static void main(String args[])
	{
		B b=new B();
		System.out.println(b.i);  //100
		System.out.println(b.j);  //100
	}
}

class C
{
	int i;
	C(int c)
	{
		i=c;
	}
}
class B extends C
{
	int j;
	B()
	{
		super(10);

		System.out.println("Let's see the value of j before j=i  "+j); //0 it is initialised to 0
		j=i;
	}
}


```

3. Accessing the data members of parent in the child

```java


class A
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.show();
	}
}

class B extends C
{
   int j=20;
   void show()
   {
   	System.out.println(j+"- is the value of (j instance variable)");  //20
   	System.out.println("I want to access parent i"+i);  //10 It is accessible because B is the child class
   }
}


class C
{
	int i=10;
}

```



4. Parent and child with the same named member function.

```java

class A
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.show();
	}
}

class B extends C
{
   
   void show()
   {
   	System.out.println("show of B");  //show of B ,because instance method of parent need to be called by super()

   }
}


class C
{
	void show()
	{
		System.out.println("show method of parent C");
	}
}

```


5. A minute change in the above - calling parent show using super()

```java

class A
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.show();
	}
}

class B extends C
{
   
   B()
   {
   	super.show();
   }

   void show()
   {
   	System.out.println("show of B");  //show of B ,because instance method of parent need to be called by super()

   }
}


class C
{
	void show()
	{
		System.out.println("show method of parent C");
	}
}



```



6. Constructor overloading.


```java



class A
{
	public static void main(String args[])
	{
		B obj=new B(10);
		B obj_b=new B(7,11);
		obj.area();
		obj_b.area();
	}
}

class B 
{
   int r,l,b;
   B(int x)
   {
   	r=x;
   }
   B(int x,int y)
   {
   	l=x;
   	b=y;
   }

   void area()
   {
   	if (r>0)
   	{
   		System.out.println(3.14*r*r);
   	}

   	if (l>0 && b>0)
   	{
   		System.out.println(l*b);
   	}
   }
}


```

6. Use of this keyword

```java


class A
{
	public static void main(String args[])
	{
	   B obj=new B(10);
	   obj.show();
	}
}

class B 
{
   int i,j;
   void show()
   {
   	System.out.println(i+j);
   }

   B(int x)
   {
   	  this(20,29);
   	  i=x;
   }

   B(int x,int y)
   {
   	this(1,1,2);
   	System.out.println("Seriously");
   	j=x+y;
   }
   B(int x,int y,int z)
   {
   	System.out.println("Yippie 3 argumensts");
   }

}



//Yippie 3 argumensts
//Seriously
//59
```


7.  Use of super and this simultaneously

```java


class A
{
	public static void main(String args[])
	{
       B obj=new B();
       obj.display();
	}
}


class B extends C
{
   void show()
   {
   	System.out.println("show of B ,child");
   }
   void display()
   {
   	show();
   	super.show();
   	this.show();
   }
}



class C
{
	void show()
	{
		System.out.println("show method of C ,parent");
	}
}


// show of B ,child
// show method of C ,parent
// show of B ,child


```



8. 

```java

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

```