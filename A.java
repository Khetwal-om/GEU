import java.util.*;


public class A
{
	public static void main(String args[])
	{
		Integer i=9;
		Double d=11.9;
		String s="icardi";

		Vector v=new Vector();
		v.addElement(i);
		v.addElement(d);
		v.addElement(s);
		System.out.println(v);
	}
}

//D:\GEU\Semester_fifth\core-java-concepts>javac A.java
//		Note: A.java uses unchecked or unsafe operations.
//		Note: Recompile with -Xlint:unchecked for details.
//
//		D:\GEU\Semester_fifth\core-java-concepts>java A
//		[9, 11.9, icardi]
