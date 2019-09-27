# sept 12 

---

GitHub supports emoji! :+1: :sparkles: :camel: :tada: :rocket: :metal: :octocat: 


1. __Wrapper Class__ : We can convert one type to another by the help of *Wrapper Class* . Each *primitive 
data type* corresponds to a *Wrapper class*. 

Primitive data type | Wrapper class
 ------------ | ------------
 bytes 8  | Byte
 short 16 | Short
 int   32 | Integer
 long 64  | Long
 float 32 | Float
 double 64| Double
 char 16  | Character
 boolean 1| Boolean

   * We can use these classes to convert one type to another. We can convert primitive integer into corresponding object by the help of *Integer* wrapper class.

2. __Boxing__   :octocat:  Boxing is converting primitive data type to object.

```java
int i=7;
Integer iobj=new Integer(i);        //Boxing

```
> The object can further be converted to string  using, further we can reverse it using StringBuffer.

```java
String s=iobj.toString();
```
\

 Before JDK 1.5 we can't convert wrapper class object directly as 
```java
Integer i=new Integer(5);
int x=i.intValue();
```
\

This is to mention the use of parseInt as well as StringBuffer
```java
class A
{
	public static void main(String[] args) {



		Integer tag=new Integer(4);
		int k=tag.intValue();              //unboxing
		System.out.println(k*10);


		int initialvalue=123456789;
		Integer valueobj=new Integer(initialvalue);

		String s=valueobj.toString();
		System.out.println(s);
		StringBuffer obj=new StringBuffer(s);
		obj.reverse();
		System.out.println("This is the value of StringBuffer object :"+obj);
		System.out.println("This is the value of s                   :"+s);

		String m=obj.toString();
		System.out.println(m);
		int ui=Integer.parseInt(m);	
		System.out.println(ui-1);
	}
}
```


3. **Unboxing** : is converting object to a primitive data type.

> wrapperclassobj.datatypeValue();

```java
		Integer tag=new Integer(4);
		int k=tag.intValue();
		System.out.println(k*10);
```


4. **Autoboxing** and **Autounboxing** : In autoboxing we can assign a primitive directly to object and vice versa for the latter.

```java
	Integer i=new Integer(5);  //boxing
	Integer i=7;               // auto boxing

	int k=i;    			   // auto unboxing
	int k=i.intValue();        // unboxing         

```

5. We can use wrapper class object to call its method. Wrapper class may contain some static methods.

```java

Integer i=7;   // Auto boxing
String s=Integer.toString(7);

```

```java
class A
{
	public static void main(String[] args) {
		Integer value=7654;  //autoboxing
		System.out.println(value*100);


		//  Each wrapper class have a static method toString().

		String s=value.toString();
		System.out.println(s);
		StringBuffer sobj=new StringBuffer(s);
		sobj.reverse();

		String m=sobj.toString();
		System.out.println("This is the string m"+m);
		value=Integer.parseInt(m);
		System.out.println(value*100);


			Integer I=7;
		String answer=I.toString();
		// String ui=Integer.valueOf(I);
		System.out.println(answer);
		System.out.println("");

		String binary=Integer.toBinaryString(7);
		System.out.println(binary);
	
	


	}
}


```

6. Character wrapper class functions

```java
class A
{
	public static void main(String[] args) {


    	Character grade='u';
  	   System.out.println(Character.isDigit(grade));
  	   System.out.println(Character.isLetter(grade));


  	   Character c='*';
  	   System.out.println(Character.isDigit(c));
  	   System.out.println(Character.isLetter(c));

  	   if (Character.isLowerCase(grade))
  	   {
  	   	System.out.println("yeah");
  	   }
  	   else
  	   {
  	   	System.out.println("nope");
  	   }
  	   System.out.println(Character.toUpperCase(grade));
  	   String m="kajdfsk";
  	   System.out.println(m.toUpperCase());

  	   StringBuffer obj=new StringBuffer("Check this one OUT");  // Convert this to uppercase ?

	}
}


```

> **This output is weird** 

```java

class A
{
	public static void main(String[] args) {

		Character grade='A';
		char c='A';
		System.out.println(grade+c);      // 130
		System.out.println(c);				// A
		System.out.println(grade);			// A

	}
}


```

Guess the output\

```java
class A
{
	public static void main(String[] args) {

		Character grade='A';
		char c='A';
		System.out.println(grade+c);      // 130
		System.out.println(c);				// A
		System.out.println(grade);			// A

		String result="";
		result+=c;
		System.out.println(result);
		result+=grade;
		System.out.println(result);

	}
}


```
:camel:      :tada:       :metal:

> If we want to print the values as it is use "" **prior** to adding (c+d) otherwise ready for addition
of the characters ascii value.

```java
class A
{
	public static void main(String[] args) {


			char c='A';
			char d='B';
			System.out.println(c+d);
			System.out.println(" "+c+d);

	}
}

```

This is the another one \

```java

class A
{
	public static void main(String[] args) {


			char c='1';
			char d='1';
			System.out.println(c+d);          //98
			System.out.println(" "+c+d);      //11

	}
}


```
This one is __weird__

```java

			char ui='(';          //'*','$'
			int uk=Character.getNumericValue(ui);
			System.out.println(uk);   // -1

```


7. char cannot be __dereferenced__         :rocket:

```java
class A
{
	public static void main(String[] args) {

		Character grade='u';


		String s=grade.toString();
		System.out.println(s);

		char c='i';
		String m=c.toString();         //char cannot be dereferenced
		System.out.println(m);

	}
}

```

---





:camel:      :rocket:    :+1:       :+2:    :tada: 

:sparkles:








# sept 18  :+3:

---
1. A package is a separation of classes

 by convention all package name must be small. If we are not creating user defined package in that case
 all the classes will be part of default package representing current :+4: ?.

 > One **class can use another class of same package** with any import statement.\
 We can create our own package by using package creation as package followed by __package name__.\
 :+8: Package creation should be the first statement of java program as package followed by package name.\
 The package creation statement is placed even before import statement.\
 We can create a package folder by the help of conditional compilation.\
 A package can have n number of of classes. A class in same compilation unit can use another class. :+2:
 

---


# sept 19 :rocket:

---

1. We can place number of classes within a package and one class can access another class directly without
any import . In order to use one package class by another package class we have to import a class successfully. __default means accesssible only within package__. :+1: 

2. If class is public its method are not by default public and we know the meaning of default is only accessible within package.

  Access specifier | public | protected | default | private 
  ------------ | ------------ | ------------ | ------------ | ------------
 |same class same package|yes|yes|yes|yes|
 |diff class same package|yes|yes|yes|no|
 |subclass same package|yes|yes|yes|no|
 |diff class diff package|:+1:|:+1:|:+1:|:+1:|
 |sub class diff package|:+1:|:+1:|:+1:|:+1:|
 ||||||||



1. __same class same package__

 ```java

 class A
{
	public static void main(String[] args) {
		zero();
		first();
		second();
		third();
		}

		static void zero()
		{
			System.out.println("within default method  |same class | same package");
		}
		public static void first()
		{
			System.out.println("within public method first  |same class | same package|");
		}
		protected  static void second()
		{
			System.out.println("within protected method second |same class |same packge");
		}
		private static  void third()
		{
			System.out.println("within private method third |same class |same package");
		}

	
}



within default method  |same class | same package
within public method first  |same class | same package|
within protected method second |same class |same packge
within private method third |same class |same package

```

2. different class same package

 	
	*this is with an error, :-1: error because private method is not accessible within different class
	even if the package is same*

```java
class A
{
	public static void main(String[] args) {
		
		B obj=new B();

		obj.zero();
		obj.first();
		obj.second();
		obj.third();
	
}

}

class B
{

		static void zero()
		{
			System.out.println("within default method  |same class | same package");
		}
		public static void first()
		{
			System.out.println("within public method first  |same class | same package|");
		}
		protected  static void second()
		{
			System.out.println("within protected method second |same class |same packge");
		}
		private static  void third()
		{
			System.out.println("within private method third |same class |same package");
		}

}


// A.java:10: error: third() has private access in B
//                 obj.third();
//                    ^
// 1 error

```

	* this is without an error :+1: , Here rest three public,protected,default are available.*


```java
class A
{
	public static void main(String[] args) {
		
		B obj=new B();

		obj.zero();
		obj.first();
		obj.second();
	
	
}

}

class B
{

		static void zero()
		{
			System.out.println("within default method  |different | same package");
		}
		public static void first()
		{
			System.out.println("within public method first  |different class | same package|");
		}
		protected  static void second()
		{
			System.out.println("within protected method second |different class |same package");
		}
		

}


D:\GEU\Semester_fifth\core-java-concepts\lecture>java A
within default method  |different class | same package
within public method first  |different class | same package|
within protected method second |different class |same package
```



3. subclass same package

 **private method is not available for the subclass**

```java
class A
{
	public static void main(String[] args) {
		
	
	C obj=new C();
}

}

class B 
{

		static void zero()
		{
			System.out.println("within default method  |sub class | same package");
		}
		public static void first()
		{
			System.out.println("within public method first  |sub class | same package|");
		}
		protected  static void second()
		{
			System.out.println("within protected method second |sub class |same packge");
		}
		private static void third()
		{
			System.out.println("within private method third | sub class |same package");
		}
		

}
class C extends B
{
	{
		zero();
		first();
		second();
		third();
	}
}



A.java:39: error: cannot find symbol
                third();
                ^
  symbol:   method third()
  location: class C
1 error

```
  **This is valid**

```java
class A
{
	public static void main(String[] args) {
		
	
	C obj=new C();
}

}

class B 
{

		static void zero()
		{
			System.out.println("within default method  |sub class | same package");
		}
		public static void first()
		{
			System.out.println("within public method first  |sub class | same package|");
		}
		protected  static void second()
		{
			System.out.println("within protected method second |sub class |same packge");
		}

		

}
class C extends B
{
	{
		zero();
		first();
		second();

	}
}



within default method  |sub class | same package
within public method first  |sub class | same package|
within protected method second |sub class |same packge

```

4. Different class different package

  *class English within package languageA*

```java

package languageA;

public class English
{
	public static void main(String[] args) {


	}

		static void zero()
		{
			System.out.println("within default method  |different class | different package");
		}
		public static void first()
		{
			System.out.println("within public method first  |different class | different package|");
		}
		protected  static void second()
		{
			System.out.println("within protected method second |different class |different packge");
		}
		private static void third()
		{
			System.out.println("within private method third  | different class | different package");
		}

}



```
	


5. **subclass different package**


	* class Spanish within package languageB*

> In different class diffferent package only public method is available.

```java
package languageB;
import languageA.*;
public class Spanish
{
	public static void main(String[] args) {
		English obj=new English();

		obj.zero();
		obj.first();
		obj.second();
		obj.third();
	}
}



Spanish.java:8: error: zero() is not public in English; cannot be accessed from outside package
                obj.zero();
                   ^
Spanish.java:10: error: second() has protected access in English
                obj.second();
                   ^
Spanish.java:11: error: third() has private access in English
                obj.third();
                   ^
3 errors

```

	*If we extend English in spanish then public and protected methods are accessible*

```java
package languageB;
import languageA.*;
public class Spanish extends English
{
	public static void main(String[] args) {
		English obj=new English();

		obj.zero();
		obj.first();
		obj.second();
		obj.third();
	}
}





Spanish.java:8: error: zero() is not public in English; cannot be accessed from outside package
                obj.zero();
                   ^
Spanish.java:11: error: third() has private access in English
                obj.third();
                   ^
2 errors
```


---

























# sept 20     :+1:     Exception Handling

---

1. __Exception Handling__: Exceptions are abnormal conditions arising in a code segment at run time.
    There may be two type of errors 
    > Compile time \
      Run time

* Compile time errors are like missing semicolons and can't be handled.
* Runtime errors are called exceptions and can be handled by using mechanism like try,catch,throw,finally and throws.
* Exception should be handled and can be handled only once.
* Handling of exception means we are telling user the cause and place of exception. Exception may occur
it is not suer it will.
* There are certain predefined exceptions for specific conditions like __Arithmetic__,__ArrayIndexOutOfBounds__.

* **All exceptions are in the form of Object**.

 *Throwable*

Error | Exception
 ------------ | ------------
   |   Runtime
 IOException,FileNotFound |   Arithmetic,ArrayIndexOutOfBounds,NullPointer 

 NumberFormatException


* We can handle exception explicitly by the help of try and catch. We have to put lesser code in try
that may generate an exception.

* **Java is robust because of Strong exception handling concepts**.

* try can be used in the following ways:

1. The first one

```java

try
{

}
catch(Exception e)
{

}

```

2. Second one

```java
try
{

}
catch (ExceptionType1 e1)
{

}
catch( ExceptionType2 e2)
{

}
```

3. Third 

```java

try
{

}
catch(Exception e)
{

}
finally
{}
```

4. Fourth

```java

try
{

}
catch (RuntimeException e)
{

}
catch()
{

}
....
catch(Exception e)
{

}
finally
{

}
```

5. Fifth one :sparkles:

```java

```

---



2. We can nest one try within another . The outer try can use outer  catch but **outer try can't use
inner catch.**

```java

class A
{
	public static void main(String[] args) {
		
		System.out.println("1");
		try{
			System.out.println("2");
			try
			{
				System.out.println(5/0);
			}
			catch(NullPointerException obj)
			{
				System.out.println(obj);
			}
			System.out.println("3");
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		System.out.println("5");

	}
}

// 1
// 2
// java.lang.ArithmeticException: / by zero
// 5

```



3. We can use finally block **with a try or with try catch** . 

> **Finally block never handle exception.** It is a block which is always executed . \
  Exception occurs or not it doesn't matter for finally to get executed.






# sept 21 

---

1. We can use a finally block without __catch__

> Finally never handles an exception

__Syntax__

```java

try{

}
finally
{

}
```
  \
  If there is no catch __finally is called by JVM before control is passed to try__

  :sparkles: ?          ?  Fix this issue.

```java

class A
{
	public static void main(String[] args) {
		
		System.out.println("first");
		try
		{
			System.out.println("I am within try"+5/0);
		}

		finally
		{
			System.out.println("Within finally");
		}

		System.out.println("Last");
	}
}

// first
// Within finally
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at A.main(A.java:9)

```


---



# sept 23


---

1. :rocket:  We can create our own exception and it can be thrown on some user condition. 
	
 > We can throw only those instances whcih are of type throwable.\
 We can throw an exception by the help of throw keyword.\

```java
class A
{
	public static void main(String[] args) {
		
		B b=new B();
		b.calculate(11000,10);
		b.calculate(1000,20);

// 		110000
// Exception in thread "main" java.lang.RuntimeException: RuntimeException obj
//         at B.calculate(A.java:16)
//         at A.main(A.java:7)
		
	}
}

class B
{
	void calculate(int basic,int days)
	{
		RuntimeException obj=new RuntimeException("RuntimeException obj ");
		if(basic>=10000)
			System.out.println(basic*days);
		else
			throw obj;       // explicit
	}
}
```
The exception thrown can be checked or unchecked.\
If we are not able to handle exception under category checked using try block we have to use throws keyword.


2. Invalid 

```java

class A
{
	public static void main(String[] args) {
		
		B b=new B();
		b.calculate(11000,10);
		b.calculate(1000,20);

	}
}

class B
{
	void calculate(int basic,int days)
	{
		Exception obj=new Exception("RuntimeException obj ");
		if(basic>=10000)
			System.out.println(basic*days);
		else
			try
		{
			throw obj;       // explicit
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

// java:22: error: unreported exception Exception; must be caught or declared to be thrown
//                         throw obj;       // explicit
//                         ^
// 1 error

```
3. This is valid

```java
class A
{
	public static void main(String[] args) {
		
		B b=new B();
		b.calculate(11000,10);
		b.calculate(1000,20);

	}
}

class B
{
	void calculate(int basic,int days)
	{
		RuntimeException obj=new RuntimeException("RuntimeException obj ");
		if(basic>=10000)
			System.out.println(basic*days);
		else
			try
		{
			throw obj;       // explicit
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
```

4. 
---





# sept 23


* Largest palindromic string


```java


class A
{
	public static void main(String[] args) {

		String s="abababaabbabacccaaaabaaaaiaaaaabaaaaa1111112111111";
		System.out.println(s.length());
		System.out.println(longestPalindrome(s));

}

		 public static String interMediate(String s,int left,int right)
		{
			if (left>right) return null;

			while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
			{

				left--;
				right++;
			}

			return s.substring(left+1,right);
		}


		public static  String longestPalindrome(String s)
		{
			if (s==null) return null;
			String longest=s.substring(0,1);
		
			for (int i=0; i<s.length()-1 ; i++) {
			 	String palindrome=interMediate(s,i,i);
			if(longest.length()<palindrome.length())
			 {
				longest=palindrome;
			 }

			 	palindrome=interMediate(s,i,i+1);
			 	if(palindrome.length()>longest.length())
			 	{
			 		longest=palindrome;
			 	}

		}

			return longest;
		}


      	

}



```


---

# Sept 26

1. If a method is throwing checked or unchecked exception it should be handled by the help or try
catch. If exception is under category unchecked like runtime exception it is not mandatory to provide 
try and catch at compile time. __JVM__ can handle it :+1:   
 __If exception are under category checked it is vital to tell at compile time using try catch that how
 you will handle it at runtime__

 > If a method is not capable to handle exception under category checked it must guard to all calling
 methods using throws keyword.\
 If a method is not throwing exception and using throws clause it should be handled properly.


2. A **Constructor** can also throw an exception.

```java

public class A
{
	public static void main(String[] args) {
		
		try
		{
		B b=new B();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	
	}
}


class B
{	
	B() throws Exception
	{

	}

}
```

3. We can throw __Custom exceptions__ on some user condition , a method can throw more than 
one exception checked or unchecked , implicitly or explicitly.
 If it is under category checked it should be handled at compile time.

4. We we create object of a class and print that object it internally calls **toString()** method
 and prints hexadecimal address using hex method.

```java

public class A
{
	public static void main(String[] args) {
		
	
		B obj=new B();
		long l=obj.hashCode();
		String hexstring=Integer.toHexString((int)l);
		String name=obj.getClass().getName();
		System.out.println(name+"@"+hexstring);

		System.out.println(obj);

	}
}


class B
{	


}

B@4cc77c2e
B@4cc77c2e



```


---



# sept 27

    :disappointed:

---

 :expressionless: File Operations :unamused:
   

1. We can manage input output operation on some 
standard input output devices by the help of several stream classes. The two types of stream classes are :

> :+1:  Character stream    :smile: Byte stream(8 bit data) \
 The two predefined streams can be used directly to manipulate iput output operation. These are
 	__system.in__ _output stream_ and __system.out__ , __system.err__ ( _input stream_) . \
 __System.in__ is by default associated with *keyboard* while __System.out__ and __System.err__ are associated with *monitor*.




2. We can redirect output of type *out* to a file. Output of type *err* will be visible on 
 *monitor*.

3. We can read from a keyboard using *System.in*
 As we know *System.in* is an object of Input Stream.

4. Read method returns __Integer Value__ . It's
an Integer value *equivalent* to __ASCII__ of readed character. We can read from a file or from a :+1: *keyboard buffer* . All reading will be in sequence as we know file are accessed sequentially.
> If we give 'a' as input and press enter \
  *\r*   - carriage return ASCII value  13\
  *\n*   - new line return ASCII value  10

5. We can read and write from keyboard and to monitor as well as file can be used as a standard *input/output* device.

6. We can create a file by the help of java program in order to perform *input/output* operation.

7. File is a class and can be used to create a file or a directory.


```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/textfilecreated.txt");
		System.out.println(f.createNewFile());

	}
}

```

---

 :joy:  __Before__

//  Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

// 09/27/2019  07:46 PM    <DIR>          .
// 09/27/2019  07:46 PM    <DIR>          ..
// 09/27/2019  01:44 PM               186 A.java
// 09/27/2019  07:42 PM            23,951 README.md
// 09/27/2019  07:46 PM               249 S.java
//                3 File(s)         24,386 bytes
//                2 Dir(s)  67,851,816,960 bytes free


:imp: 	__after__

Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:46 PM    <DIR>          .
09/27/2019  07:46 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:42 PM            23,951 README.md
09/27/2019  07:46 PM               595 S.class
09/27/2019  07:46 PM               669 S.java
09/27/2019  07:46 PM                 0 textfilecreated.txt
               5 File(s)         25,401 bytes
               2 Dir(s)  67,851,816,960 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>

---

8. We can create a file within a directory provided the directory should *exist* . We can create a 
directory by the help of *File* class object.

```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/findmeinparis");
		System.out.println(f.mkdir());

	}
}

```

---

Before :-1:


 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:46 PM    <DIR>          .
09/27/2019  07:46 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:50 PM            25,584 README.md
09/27/2019  07:46 PM               595 S.class
09/27/2019  07:51 PM               237 S.java
09/27/2019  07:46 PM                 0 textfilecreated.txt
               5 File(s)         26,602 bytes
               2 Dir(s)  67,851,812,864 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>javac S.java

D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
true


:imp: __After__



 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:51 PM    <DIR>          .
09/27/2019  07:51 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:51 PM    <DIR>          findmeinparis
09/27/2019  07:50 PM            25,584 README.md
09/27/2019  07:51 PM               581 S.class
09/27/2019  07:51 PM               237 S.java
09/27/2019  07:46 PM                 0 textfilecreated.txt
               5 File(s)         26,588 bytes
               3 Dir(s)  67,851,812,864 bytes free


---

9. Use of __mkdirs()__ to create multiple directories.

 :sunglasses: :dizzy_face:          :imp:
    :smiling_imp:
    :neutral_face:
    :no_mouth:
    :innocent:
    :alien:
    :yellow_heart:
    :blue_heart:


```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/a/aa/aaa");
		System.out.println(f.mkdirs());

	}
}


D:\GEU\Semester_fifth\core-java-concepts\lecture>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:51 PM    <DIR>          .
09/27/2019  07:51 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:51 PM    <DIR>          findmeinparis
09/27/2019  07:54 PM            27,121 README.md
09/27/2019  07:51 PM               581 S.class
09/27/2019  07:54 PM               229 S.java
09/27/2019  07:46 PM                 0 textfilecreated.txt
               5 File(s)         28,117 bytes
               3 Dir(s)  67,851,812,864 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>javac S.java

D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
true

D:\GEU\Semester_fifth\core-java-concepts\lecture>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:55 PM    <DIR>          .
09/27/2019  07:55 PM    <DIR>          ..
09/27/2019  07:55 PM    <DIR>          a
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:51 PM    <DIR>          findmeinparis
09/27/2019  07:54 PM            27,121 README.md
09/27/2019  07:55 PM               577 S.class
09/27/2019  07:54 PM               229 S.java
09/27/2019  07:46 PM                 0 textfilecreated.txt
               5 File(s)         28,113 bytes
               4 Dir(s)  67,851,812,864 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>cd a

D:\GEU\Semester_fifth\core-java-concepts\lecture\a>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture\a

09/27/2019  07:55 PM    <DIR>          .
09/27/2019  07:55 PM    <DIR>          ..
09/27/2019  07:55 PM    <DIR>          aa
               0 File(s)              0 bytes
               3 Dir(s)  67,851,812,864 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture\a>cd aa

D:\GEU\Semester_fifth\core-java-concepts\lecture\a\aa>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture\a\aa

09/27/2019  07:55 PM    <DIR>          .
09/27/2019  07:55 PM    <DIR>          ..
09/27/2019  07:55 PM    <DIR>          aaa
               0 File(s)              0 bytes
               3 Dir(s)  67,851,812,864 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture\a\aa>
```




10. 









# Create a new file

```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/Jio.txt");
		System.out.println(f.createNewFile());  //true 
	}
}
```


11. What if we name the directory as "a.file".

  :rage1:
    :rage2:
    :rage3:
    :rage4:
    :suspect:
    :trollface:


    *notice a.file is dir*


```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/a.file");
		System.out.println(f.mkdir());

	}
}



D:\GEU\Semester_fifth\core-java-concepts\lecture>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:59 PM    <DIR>          .
09/27/2019  07:59 PM    <DIR>          ..
09/27/2019  07:55 PM    <DIR>          a
09/27/2019  07:59 PM    <DIR>          a.file
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:51 PM    <DIR>          findmeinparis
09/27/2019  07:58 PM            30,341 README.md
09/27/2019  07:59 PM               574 S.class
09/27/2019  07:58 PM               230 S.java
09/27/2019  07:46 PM                 0 textfilecreated.txt
               5 File(s)         31,331 bytes
               5 Dir(s)  67,851,808,768 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>
```



12. We can display the data of file.

```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/textfilecreated.txt");
		FileReader fr=new FileReader(f);
		int k;

		while((k=fr.read())!=-1)
		{
			System.out.println(k);
		}
	}
}


97
98
99
100
101
102
103
104
105
13  // carriage return       /r
10  // new line              /n 

```

13. The whole file can be displayed as

```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/S.java");
		FileReader fr=new FileReader(f);
		int k;

		while((k=fr.read())!=-1)
		{
			System.out.print((char)k);
		}
	}
}



D:\GEU\Semester_fifth\core-java-concepts\lecture>javac S.java

D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
import java.io.*;


class S
{
        public static void main(String[] args)  throws IOException
         {

                File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/S.java");
                FileReader fr=new FileReader(f);
                int k;

                while((k=fr.read())!=-1)
                {
                        System.out.print((char)k);
                }
        }
}


D:\GEU\Semester_fifth\core-java-concepts\lecture>

```


14. Some of the methods

:pouting_cat:
    :japanese_ogre:
    :japanese_goblin:
    :see_no_evil:
    :hear_no_evil:
    :speak_no_evil:

```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/S.java");

		System.out.println(f.length());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.getAbsolutePath());

	}
}



D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
352
true
false
D:\GEU\Semester_fifth\core-java-concepts\lecture\S.java


```


---

```java

import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("octave.txt");

		System.out.println(f.length());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.getAbsolutePath());


		File obj=new File("nova.txt");
		System.out.println(f.renameTo(obj));

	}
}



D:\GEU\Semester_fifth\core-java-concepts\lecture>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  08:22 PM    <DIR>          .
09/27/2019  08:22 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  08:09 PM                 5 octave.txt
09/27/2019  08:16 PM            33,551 README.md
09/27/2019  08:22 PM               783 S.class
09/27/2019  08:22 PM               381 S.java
               5 File(s)         34,906 bytes
               2 Dir(s)  67,851,800,576 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>javac S.java

D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
5
true
false
D:\GEU\Semester_fifth\core-java-concepts\lecture\octave.txt
true

D:\GEU\Semester_fifth\core-java-concepts\lecture>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  08:23 PM    <DIR>          .
09/27/2019  08:23 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  08:09 PM                 5 nova.txt
09/27/2019  08:16 PM            33,551 README.md
09/27/2019  08:22 PM               783 S.class
09/27/2019  08:22 PM               381 S.java
               5 File(s)         34,906 bytes
               2 Dir(s)  67,851,800,576 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>
```

---


15. *list vs ListFile*

---

```java

import java.io.*;

public class S
{
	public static void main(String[] args) {
		
	 File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture");
	 String s[]=null;

	 if (f.isDirectory())
	 {
	 	s=f.list();
	 }

	 for(String r:s)
	 {
	 	System.out.println(r);
	 }
	}
}



D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
A.java
nova.txt
README.md
S.class
S.java

D:\GEU\Semester_fifth\core-java-concepts\lecture>

```

*listFiles() returns the absolute path of files*

```java
import java.io.*;

public class S
{
	public static void main(String[] args) {
		
	 File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture");
	 File wow[]=null;


	 if (f.isDirectory())
	 {
	 	wow=f.listFiles();
	 }

	 for(File r:wow)
	 {
	 	System.out.println(r);
	 }
	}
}



D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
D:\GEU\Semester_fifth\core-java-concepts\lecture\A.java
D:\GEU\Semester_fifth\core-java-concepts\lecture\nova.txt
D:\GEU\Semester_fifth\core-java-concepts\lecture\README.md
D:\GEU\Semester_fifth\core-java-concepts\lecture\S.class
D:\GEU\Semester_fifth\core-java-concepts\lecture\S.java

D:\GEU\Semester_fifth\core-java-concepts\lecture>
```

---

16. A file can be used as an input/output device i.e., data can be readed from it. To perform input/output operation two types of *streams* are used:

> *Byte*\
*Stream*

17. **Stream** is sequence of data when we are using Character stream we are dealing with 16 bit while we deal with byte it is *8bit*.

18. Inorder to use stream we should follow

> openStream()\
 useStream()\
 closeStream()

19. There are several classes in support of these
stream category.

Reader  read()  | Writer    write()
 ------------ | ------------
InputStreamReader | OutPutStreamWriter
FileReader        |  PrintWriter
BufferedReader  | FileStreamWriter



20. FileReader and FileWrite class can be used to read and write to file.

21. If  file exist and have no content means is empty then read method returns -1.



---