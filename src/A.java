import java.util.*;


public class A {
    int a,b,c;
    void area()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("hi there , enter the length");
        a=obj.nextInt();
        System.out.println("Enter the width");
        b=obj.nextInt();
        c=a*b;
        System.out.println(c);
    }
}

class X {
    int x;
    void square()
    {
        System.out.println("This is x method");
    }

}


class Call {
    public static void main(String [] args)
    {
        System.out.println("Aakash harry gopi");
        A obj=new A();
        obj.area();
        X objeto=new X();
        objeto.square();
    }
}