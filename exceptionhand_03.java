import java.util.Scanner;
import java.lang.ArithmeticException;

public class exceptionhand_03
{
    public static void main(String []args)
    {
         int a, b, c;
        Scanner mano=new Scanner(System.in);
        a=mano.nextInt();
        b=mano.nextInt();
        System.out.println(c);
        if(b==0)
        {
            System.out.println("you have wrong input");
        }
        else
        {
            c=a/b;
            System.out.println("quotient="+c);
        }
    }
}