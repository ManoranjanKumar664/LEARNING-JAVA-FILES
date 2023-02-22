import java.util.Scanner;

class test
{
    int x;
    {
        x=500;
        System.out.println("value before initialisatio="+x);
    }
    test(int a)
    {
        x=a;
        System.out.println("the value after initialisation="+x);
    }
}
public class inti01
{
    public static void main(String []args)
    {
        test mano=new test(5);
    }
}