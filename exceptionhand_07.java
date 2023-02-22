import java.util.Scanner;
import java.lang.ArithmeticException;

public class exceptionhand_07
{
    public static void main(String []args)
    {
    int bal=500;
    int wamount=600;
    try{
    if(bal<wamount)
      throw new ArithmeticException("this is arithmeticexception");
      bal=bal-wamount;    
      System.out.println("balance left="+bal);
    }
    catch(ArithmeticException x)
    {
        System.out.println(x.getMessage());
    }

    }
}