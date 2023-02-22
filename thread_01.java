import java.lang.Thread;
import java.lang.Runnable;

class student implements Runnable
{
    int s_roll;
    String s_name;

    void run()
    {
        take_roll(int x);
        take_name(String namex);
        show_both();
    }

    void take_roll(int x)
    {
        s_roll=x;
    }
    void take_name(String name)
    {
        s_name=name;
    }
    void show_both()
    {
       // System.out.print("name="+s_name);
       System.out.print("name="+s_name+"   "+"rollno.="+s_roll);
    }
}

 public class thread_01
 {
    public static void main(String []args)
    {
        student s1=new student();
        s1.take_roll(40);
        s1.take_name("ranjan");
        s1.show_both();
        System.out.println();
        student s2=new student();
        s2.take_roll(50);
        s2.take_name("mohan");
        s2.show_both();
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s2);
    }
 }