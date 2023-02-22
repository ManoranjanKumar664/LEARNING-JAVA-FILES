import java.util.Scanner;
import java.lang.NullPointerException;

public class exceptionhand_04
{
    public static void main(String []args)
   {
    String mano=null;
    try
    {
        System.out.println(mano.length());
    }
    catch(NullPointerException e)
    {
    System.out.println("this is the catch block");
    }
   }
}