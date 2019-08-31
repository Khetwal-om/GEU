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

4. 

4. 


---