import java.util.*;

public class bufferString_01
{
 public static void main(String []args)
 {
    TreeSet t=new TreeSet();
    t.add(new StringBuffer("mano"));
    t.add(new StringBuffer("ranjan"));
    t.add(new StringBuffer("baskey"));
    StringBuffer b1=new StringBuffer("ram");
    t.add(b1);
    StringBuilder b2=new StringBuilder("sam");
    t.add(b2);
    System.out.println(t);
 }
}