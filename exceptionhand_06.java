import java.util.Scanner;
import java.lang.ArithmeticException;
import java.lang.NullPointerException;

public class exceptionhand_06
{
    public static void main(String []args)
    {
    
    try{
        int x=20/0;
        String m=null;
        System.out.println(m.length());
    }
    
    catch(NullPointerException e)
    {
        System.out.println("this is nullpointerexception");
    }
    /* 
   catch(ArithmeticException p)
    {
        System.out.println("this is the arithmeticexception");
    } */
    finally{
        System.out.println("this is the finally block");
    }
        
    }
}