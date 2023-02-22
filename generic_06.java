import java.util.ArrayList;

class go<meme>
{
    meme go1;
    void take(meme go2)
    {
        go1=go2;
       // System.out.println("value at go1="+go1);
    }

    void show()
    {
        System.out.println("value at go1="+go1);
    }
}

class boys
{
    int marks1;
    void take_marks(int marks2)
    {
        marks1=marks2;
    }
    void show_marks()
    {
        System.out.println("marks of the student="+marks1);
    }
}

class student
{
    int roll;
    String name;
    void take_roll(int x)
    {
        roll=x;
    }
    void take_name(String n)
    {
        name=n;
    }
    void show_both()
    {
        System.out.println("roll with name="+roll+"and"+name);
    }
}

class hello<this_is_hello>
{
    this_is_hello tih;
    void take_hello(this_is_hello tih2)
    {
        tih=tih2;
    }
    <E> void take_ref()
    {
        tih.
    }

}

public class generic_06
{
    public static void main(String []args)
    {
        ArrayList<String> a1=new ArrayList<String>(3);
       // a1.add(50);
        //a1.add(60);
        a1.add("ranjan");
        a1.add("baskey");
        System.out.println("value of a1="+a1);
        String s1=new String("hello");
        go<Integer> g1=new go<Integer>();
        g1.take(4999);
        g1.show();
        go<String> g2=new go<String>();
        g2.take("ranjan");
        g2.show();

        student s2=new student();
        s2.take_roll(50);
        s2.take_name("ram");

        hello<student> h1=new hello<student>();
        h1.take_hello(s2);

        boys b1=new boys();
        b1.take_marks(90);
        
        hello<boys> h2=new hello<boys>();
        h2.take_hello(b1);


    }
}