import java.lang.Thread;
import java.lang.Runnable;
import java.util.Scanner;

class mano implements Runnable
{
    void input()
    {
        Scanner go1=new Scanner(System.in);
        System.out.println("enter the first no.");    
        int a=go1.nextInt();
        System.out.println("enter the second no.");
        int b=go1.nextInt();
        int c=a+b;
        System.out.println("sum of two number"+c);
    }

 
    public void run()
    {
        input();
      //  take();
        //System.out.println("this is the thread");
    }
}

class hello implements Runnable
{
    public synchronized void take()
    {
        String s_name=new String("this is maonranjan");
        String g_name=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the last name");
        g_name=sc.next();
        System.out.println("joined name="+s_name+"  "+g_name);
    } 

    public void run()
    {
        take();
    }
}
public class thread_03
{
 public static void main(String []args)
 {
  hello m1=new hello();
  Thread t1=new Thread(m1);
  hello h1=new hello();
  Thread t2=new Thread(h1);
  t2.start();
  t1.start();
 }
}