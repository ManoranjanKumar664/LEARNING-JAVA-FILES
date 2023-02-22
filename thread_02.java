import java.lang.Thread;
import java.lang.Runnable;

class student implements Runnable
{
    int x;
    public void run()
    {
      show();
    }
    
    void show()
    {
        System.out.println("manoanjan");
    }
}

public class thread_02
{
    public static void main(String []args)
    {
        student s=new student();
        Thread t=new Thread(s);
    }
}