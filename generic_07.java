import java.util.Scanner;

class mano<placeholder>
{
    placeholder p1;
    void take_value(placeholder p2)
   {
    p1=p2;
   }
   void show_value()
   {
    System.out.println("value at p1="+p1);
   }
   placeholder return_value()
   {
    return p1;
   }
}

class student
{
    int x;
    void take(int i)
    {
        x=i;
    }
    void show()
    {
        System.out.println("value at x="+x);
    }
}


public class generic_07
{
    public static void main(String []args)
    {
        Integer i1=Integer.valueOf(500);
        mano<Integer> m1=new mano<Integer>();
        m1.take_value(i1);
        m1.show_value();
        String s1=new String("ranjan baskey");
        mano<String> m2=new mano<String>();
        m2.take_value(s1);
        m2.show_value();
        student st1=new student();
        st1.take(2);
        mano<student> m3=new mano<student>();
        m3.take_value(st1);
        m3.show_value();
        student st2=m3.return_value();
        st2.show();
    }
}