import java.util.ArrayList;

class mano
{
    <mn> mano(mn a13)
    {
      System.out.println(a13);  
    }
}

class arraylist_05
{
    public static void main(String []args)
    {
        ArrayList a1=new ArrayList(3);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        mano ob=new mano(a1.get(2));
       // System.out.println(a1.get(2));
         //Integer a=Integer.valueOf(a1.get(1));
       // int a=x+5;
       // System.out.println(x);
        System.out.println("size of the array="+a1.size());
    }
}