import java.util.*;

class person
{
    String p_name;
    void take_name(String n)
    {
        p_name=n;
    }
    void show_name()
    {
        System.out.println("name="+p_name);
    }
}

public class wrapper_03
{
    public static void main(String []args)
    {
        person p=new person();
        p.take_name("indus");
        p.show_name();
        person p2=new person();
        p2.take_name("underworld");
        p2.show_name();
        person p3=new person();
        p3.take_name("wrapperclass");
        p3.show_name();

        TreeSet tt=new TreeSet();
        tt.add(p);
        tt.add(p2);
        tt.add(p3);
    }
}