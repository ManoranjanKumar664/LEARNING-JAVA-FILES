import java.util.Scanner;
import java.lang.ArithmeticException;

public class exceptionhand_02
{
    public static void main(String []args)
    {
         int a, b, c;
        Scanner mano=new Scanner(System.in);
        a=mano.nextInt();
        b=mano.nextInt();
        try{
            c=a/b;
         }
        catch(ArithmeticException x)
        {
        System.out.println("you have entered the denominator 0");
        }
        System.out.println("quotient=");
    }
}