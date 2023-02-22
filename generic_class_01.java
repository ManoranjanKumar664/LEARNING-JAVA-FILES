class hello1<gen1>
{
    void show(gen1 x1)
    {
        gen1 a1=x1;
        System.out.println(a1);
    }

}
public class generic_class_01
{ 
    public static void main(String []args)
    {
         Integer i1=Integer.valueOf(49);
         hello1<Integer> h1=new hello1<Integer>();
         h1.show(i1);
    }
}