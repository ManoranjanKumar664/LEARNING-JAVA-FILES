import java.util.*;

class student 
{
    int s_roll;
    String s_name;
    void take_name(String name)
    {
        s_name=name;
    }
    void take_roll(int roll)
    {
        s_roll=roll;
    }
}

public class treeSet_01
{
    public static void main(String []args)
    {
        String s1=new String("mano");
        String s2=new String("ram");
        String s3=new String("sohan");
        String s4=new String("arun");
        TreeSet t1=new TreeSet();
        t1.add(s1);
        t1.add(s2);
        t1.add(s3);
        t1.add(s4);
        StringBuffer sb1=new StringBuffer("sita");
        StringBuffer sb2=new StringBuffer("geeta");
        StringBuffer sb3=new StringBuffer("priya");
        TreeSet t2=new TreeSet();
        t2.add(sb1);
        t2.add(sb2);
        t2.add(sb3);
        t2.add(new StringBuffer("suman"));
        t2.add(new StringBuffer("aarti"));
        System.out.println(t1);
        System.out.println(t2);

        
        student st1=new student();
        st1.take_name("moneyview");
        st1.take_roll(40);
        student st2=new student();
        st2.take_name("razorpay");
        st2.take_roll(50);

        TreeSet t3=new TreeSet();
        t3.add(st1);
        t3.add(st2);
        System.out.println(t3);

    }
}