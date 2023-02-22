import java.util.ArrayList;

public class generic_04
{
    <mano1> void show(mano1 y)
    {
        //mano1 x=y;
        //x="manoranjan";
        System.out.println("string at mano1="+y);
       // System.out.println("length of the string="+y.length());
    }

    public static void main(String []args)
    {
        generic_04 g1=new generic_04();
        g1.show("manoranjan");
        ArrayList<Integer> a1=new ArrayList<>(3);
        //a1.add("ram");
        a1.add(55);
        String mano="baskey";
        System.out.println("length of the string="+mano.length());
    }
}