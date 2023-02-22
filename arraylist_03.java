import java.util.Scanner;
import java.util.ArrayList;

public class arraylist_03
{
    public static void main(String []args)
    {
      //creating new arraylist arr1
       ArrayList arr1=new ArrayList(3);

       //assignning values to the arraylist arr1
       arr1.add(3);
       arr1.add(4);
       arr1.add(5);

       //showing the values of arraylist arr1
       System.out.println("value of arr1="+arr1);

       //clearing the arraylist arr1
       //arr1.clear();

       //checking whether the values present in arraylist arr1 or not
       System.out.println("value present in arr1="+arr1.contains(4));
       System.out.println("value present in arr1="+arr1.contains(6));

       //checking whether the arraylist arr1 is empty or not
       if(arr1.isEmpty())
       {
        arr1.add(40);
       }
       else
       {
        System.out.println("values alraedy present");
       }
    }
}