import java.util.Scanner;
import java.lang.ArithmeticException;

public class exceptionhand_01
{
    public static void main(String []args)
    {
        int x, y, a;
        Scanner mano=new Scanner(System.in);
        x=mano.nextInt();
        y=mano.nextInt();
        try
        {
        a=x/y;
        System.out.println(a);
        }
        catch(ArithmeticException e)
        {
            Scanner mano1=new Scanner(System.in);
            System.out.println("enter the first no.");
            int l=mano1.nextInt();
            System.out.println("enter the second no.");
            int m=mano1.nextInt();
            int n=l+m;
            System.out.println("sum of the two number="+n);
            System.out.println(e.getMessage());
        }
    }
}