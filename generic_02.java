import java.util.Scanner;

class hello1<variable01>
{
    variable01 y;
    void show(variable01 x)
    {
        y=x;+
     System.out.println(x);  
    }
}

public class generic_02
{
   public static void main(String []args)
   {
    Integer i1=Integer.valueOf(50);
    String i2=String.valueOf("mano");
    hello1<Integer> h1=new hello1<Integer>();
    hello1<String> h2=new hello1<String>();
    h1.show(i1);
    h2.show(i2);
   }
}