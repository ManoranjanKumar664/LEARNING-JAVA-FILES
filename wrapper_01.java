import java.util.*;
import java.lang.Float;

public class wrapper_01
{
    public static void main(String []args)
    {
        String s=new String("manoranjan");
        System.out.println(s);
        System.out.println(s.length());
        Integer i=Integer.valueOf(39);
        System.out.println(i);
        String s2=new String("ramchandra");
        String s3=new String("kreditbee");
        String s4=new String("truebalance");
        String s5=new String("moneyview");
        String s6=new String("coinswitch");
        ArrayList a1=new ArrayList();
        a1.add("navi");
        a1.add("roposo");
        a1.add("firework");
        a1.add("moj");
        a1.add("takatak");
        System.out.println(a1);
        TreeSet t2=new TreeSet();
        t2.add("projectmadras");
        t2.add("mumbaigullies");
        TreeSet t1=new TreeSet();
        t1.add(s);
        t1.add(s2);
        t1.add(s3);
        t1.add(s4);
        t1.add(s5);
        t1.add(s6);
        //t1.add(t2);
       // t1.add(a1);
        System.out.println(t1);
        //to find the length of the treeset object
        System.out.println(t1.size());
        //System.out.println(t1.pollFirst());
        System.out.println(t1);
       // System.out.println(t1.pollLast());
        System.out.println(t1);
      //  System.out.println(t1.floor("no_brocker"));
       // System.out.println(t1.ceiling("no_brocker"));
        //System.out.println(t1.higher("manoranjan"));
        //System.out.println(t1.lower("manoranjan"));
        System.out.println("first value="+t1.first());
        System.out.println("last value="+t1.last());
        System.out.println("tail set="+t1.headSet("moneyview"));
        System.out.println("head set="+t1.tailSet("moneyview"));
        System.out.println("sub set="+t1.subSet("kreditbee","ramchandra"));

    }
}