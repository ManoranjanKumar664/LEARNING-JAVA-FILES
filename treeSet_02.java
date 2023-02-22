import java.util.*;
import java.lang.NullPointerException;

public class treeSet_02
{
    public static void main(String []args)
    {
        TreeSet t1=new TreeSet();
        t1.add("ram");
        t1.add("sam");
        t1.add("kreditbee");
        t1.add("moneyview");
        t1.add("turebalance");
        System.out.println(t1);
        t1.pollLast();
        System.out.println(t1);
        t1.pollFirst();
        System.out.println(t1);
        t1.add("upstox");
        t1.add("grow");
        t1.add("motilal oswal");
        System.out.println(t1);
        System.out.println(t1.headSet("motilal oswal"));
        System.out.println(t1.tailSet("motilal oswal"));
        System.out.println(t1.first());
        System.out.println(t1.last());
        System.out.println(t1);
        System.out.println("floor element="+t1.floor("totolviews"));
        System.out.println("ceiling element="+t1.ceiling("tile"));
        System.out.println("heigher element="+t1.higher("upstox"));
        System.out.println("lower  element="+t1.lower("upstox"));
        //System.out.println(t1);
    }
}
/*
class student implements Comparable
{
 int roll;
 String name;
 void take_roll(int r)
 {
    roll=r;
 }
 void take_name(String s)
 {
    name=s;
 }
}

public class treeSet_02
{
    public static void main(String []args)
    {
        student st1=new student();
        st1.take_roll(50);
        st1.take_name("sohan");

        TreeSet t=new TreeSet();
        t.add(st1);
        System.out.println(t);
    }
} */