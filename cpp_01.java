import java.util.*;
import java.lang.Enumeration;

public class cpp_01
{
    public static void main(String []args)
    {
        TreeSet t1=new TreeSet();
        t1.add("ram");
        t1.add("sir-taj");
        t1.add("big-gaj");
        t1.add("adam");
        t1.add("void");
        t1.add("null");
        System.out.println(t1);
        Enumeration e=t1.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}