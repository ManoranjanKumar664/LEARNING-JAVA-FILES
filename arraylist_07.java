import java.util.ArrayList;

class arraylist_07
{
    public static void main(String []args)
    {
        ArrayList a1=new ArrayList(4);
        a1.add(40);
        a1.add(50);
        a1.add(60);
        a1.add(70);
        a1.add(80);
        a1.add(90);
        a1.add(100);
        System.out.println("vlue of a1="+a1);
        a1.set(0,100);
        System.out.println("new value of a1="+a1);
        int x=(int)a1.get(0);
        System.out.println("again new value of a1="+x);
        System.out.println("deleted value="+a1.remove(6));
       // System.out.println("all values="+a1);
       // ArrayList a3=new ArrayList(a1.subList(1,4));
       // System.out.println("sublist value="+a3);
       // System.out.println("size of the a3="+a3.size());
       // System.out.println(a1.subList(1, 4));
       // System.out.println("sublist values="+a2);
    }
}