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

```

```


---
