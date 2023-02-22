import java.util.ArrayList;
import java.lang.IndexOutOfBoundsException;

class arraylist_04
{
    public static void main(String []args)
    {
        ArrayList mano1=new ArrayList(3);
        System.out.println(mano1.isEmpty());
        try
        {
        mano1.add(3,60);
        }
        catch(IndexOutOfBoundsException e)
        {
            mano1.add(60);
            System.out.println(e.getMessage());
        }
        System.out.println(mano1.isEmpty());
    }
}