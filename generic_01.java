import java.util.Scanner;
//import java.lang.Integer;

class mano1
{
    public <x> void sum(x e[])
    {
        for(x me:e)
        {
            System.out.println(me);
        }
    }
  /*    void sum(int a)
    {
        int x=a;
        System.out.println("the value="+x);
    }
    void sum(String b)
    {
        String s1=b;
        System.out.println("string="+s1);
    } */
}

public class generic_01
{
    public static void main(String []args)
    {
        String arr[]={"ranjan", "kumar", "baskey"};
        System.out.println("length of the string="+arr[0].length());
        mano1 m1=new mano1();
        m1.sum(arr);
       // Integer i1=Integer.valueOf(59);
        //System.out.println("value="+i1);
        //mano1 m1=new mano1();
        //m1.sum(i1);
        //m1.sum("ranjan");
    }
}