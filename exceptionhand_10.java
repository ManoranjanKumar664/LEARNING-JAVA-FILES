import java.util.Scanner;
import java.lang.ArithmeticException;

public class exceptionhand_10
{
public static void main(String []args)
{
    int a, b,c;
  System.out.println("enter the value of a and b");
 Scanner mano=new Scanner(System.in);
 a=mano.nextInt();
 b=mano.nextInt();
 try{
 if(a<b)
 throw new ArithmeticException("exception occured");
  c=a-b;
  System.out.println("difference="+c);
 }
 catch(ArithmeticException x)
 { 
    System.out.println(a+"-"+b+" "+"is not possible");
 }
}
}