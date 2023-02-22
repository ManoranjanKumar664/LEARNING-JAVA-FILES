import java.util.Scanner;
import java.lang.ArithmeticException;

public class exceptionhand_05
{
    public static void main(String []args)
    {
        Scanner mano=new Scanner(System.in);
        int a=mano.nextInt();
        int b=mano.nextInt();
        try{
            int c=a/b;
            System.out.println("quotient="+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("this is the arithmeticexception");
        }
        String name=null;
        try{
            System.out.println(name.length());
        }
        catch(NullPointerException n)
        {
            System.out.println("this is the nullpointerexception");
        }
    }
}