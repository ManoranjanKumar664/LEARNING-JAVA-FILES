import java.util.*;

public class filehand_01
{
    public static void main(String []args)
    {
      String mano="manoranjan";
      int mano2[]=new int[]{49, 39, 59, 99, 79, 89, 69};
      for(int i=0;i<mano2.length;i++)
      {
        System.out.print(mano2[i]+"  ");
      }
      
      System.out.println();
      Arrays.sort(mano2, 2, 7);
       for(int i=0;i<mano2.length;i++)
      {
        System.out.print(mano2[i]+"  ");
      }

      Arrays.sort(mano2);
   
      System.out.println();
         for(int i=0;i<mano2.length;i++)
      {
        System.out.print(mano2[i]+"  ");
      }
     /* for(int i=0;i<mano.length();i++)
      {
        System.out.println(mano.length());
      } */
    }
}