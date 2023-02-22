class mano
{
    <typethis> void show(typethis a)
    {
        typethis b=a;
        System.out.println("this is the value="+b);
    }
}

class hello<method>
{
    method m1;
    void take(method m2)
    {
        m1=m2;
        System.out.println("method value="+m1);
    }
}

public class generic_03
{
    public static void main(String []args)
    {
        Integer i1=Integer.valueOf(40);
        String i2=String.valueOf("baskey");
        mano m1=new mano();
        m1.show(i1);
        m1.show(i2);
        hello i3=new hello();
        i3.take(i1);
    }
}