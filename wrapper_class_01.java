import java.util.Scanner;

public class wrapper_class_01
{
    static <E> void show(E n[])
    {
     for(E j:n)
     {
        System.out.println(j);
     }
    }

    static <E> void sum(E xy)
    {
        System.out.println("the value at m="+xy);
    }
    public static void main(String []args)
    {
        Integer a[]={89,49,30,99};
        show(a);
        int xy=300;
        sum(xy);
       /* Integer i1=Integer.valueOf("949");
        int i2=i1.intValue();
        System.out.println("no is="+i2);
        Double i4=Double.valueOf("3.5");
        double d1=i4.doubleValue();
        System.out.println("value is="+d1);*/
        //Integer x=Integer.valueOf("300");
        //System.out.println("the value present in x="+x);
       // int ivalue=Integer.parseInt(x);
        //System.out.println("value="+ivalue);
       // Integer x=Integer.valueOf("30");
       // System.out.println("value="+x);
        //System.out.println(type(x));
    }
}