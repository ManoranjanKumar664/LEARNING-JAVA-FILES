import java.util.*;

public class linkedlist_01
{
    public static void main(String []args)
    {
        LinkedList mano1=new LinkedList();
        mano1.addFirst(399);
        mano1.addLast(400);
        mano1.addLast(500);
        mano1.addLast(600);
        mano1.addFirst(700);
        ArrayList a1=new ArrayList(3);
        a1.add(77);
        a1.add(88);
        a1.add(99);
        System.out.println("vlue of a1="+a1);
        System.out.println("value="+mano1.getFirst());
        System.out.println("value at last="+mano1.getLast());
        mano1.removeLast();
        System.out.println("now value at last="+mano1.getLast());
        mano1.addLast(a1);
        System.out.println("again now value at last="+mano1.getLast());
        mano1.add(0, "ranjan");
        mano1.add(4, "baskey");
        System.out.println("new values of mano1="+mano1);
        mano1.remove(4);
        System.out.println("new value="+mano1);
        System.out.println("vlaue at index no. 4="+mano1.get(4));
        mano1.add("kumar");
        System.out.println("vlue="+mano1);
        mano1.remove();
        System.out.println("all value="+mano1);
       // mano1.clear();
       // System.out.println("value="+mano1);
       int x=(int)mano1.peekFirst();
       System.out.println("first peeked value="+x);
        System.out.println("peeked value="+mano1.peekFirst());
    }
}