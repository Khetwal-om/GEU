class J
{
	public static void main(String[] args) {
		// Object obj=5;
		// Class c=obj.getClass();
		// String s=c.getName();
		// int k=s.lastIndexOf(".");
		// String m=s.substring(k+1);
		// System.out.println(m);


		// if (m.equals("Integer"))
		// {
		// 	System.out.println((Integer)obj*1000);
		// }


		// Integer roll=7;       // auto boxing
		// int a=5;
		// Integer age=new Integer(11);
		// System.out.println(age);     // converting primitive to object

		// int i=roll.intValue();
		// System.out.println(i);

		// Double pi=3.14;
		// double pie=pi.doubleValue();
		// System.out.println(pie*10);

		// int i=345432;
		// String s=Integer.toString(i);
		// System.out.println(s);
		// StringBuffer sobj=new StringBuffer(s);
		// System.out.println(sobj.reverse());

		// long int i=123456789;
		// StringBuffer object=new StringBuffer(Integer.toString(i));
		// object.reverse();
		// String hola=object.toString();

		// System.out.println("This is hola"+hola);
		// System.out.println("This is the object"+object);
		// System.out.println("***************************");
		// System.out.println("This is hola"+hola);

		// long int k=LongInteger.parseLongInteger(hola);
		// System.out.println("This is the value of k"+k*10);

		Object o=12;
		String s=o.toString();
		StringBuffer obj=new StringBuffer(s);
		obj.reverse();
		System.out.println("This is obj"+obj);
		String answer=obj.toString();
		System.out.println(answer);

		int woohoo=Integer.parseInt(answer);
		System.out.println(woohoo*100);

		int x=4;
		Object oops=(Object)x;
		System.out.println(oops.toString());

		


	}
}