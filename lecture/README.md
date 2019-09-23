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


```java

try
{

}
catch(Exception e)
{

}

```



```java
try
{

}
catch (ExceptionType1 e1)
{

}
```




---



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