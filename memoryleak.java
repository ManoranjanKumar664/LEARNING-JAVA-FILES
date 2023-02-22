class hello2
{
    void show()
    {

        System.out.println("manoranajn baskey");
    }
}
class hello
{
    void show()
    { 
        int x=new int();
        System.out.print("hello world!");
    }
}
public class memoryleak
{
    public static void main(String []args)
    {
     hello mano2=new hello();
     hello2 mano2=new hello2();
     mano1.show();
    }
}