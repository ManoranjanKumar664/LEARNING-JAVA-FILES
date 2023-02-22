import java.util.*;

class person
{
    int p_roll;
    String p_name;
    person(int roll, String name)
    {
        p_roll=roll;
        p_name=name;
    }
    
    int return_roll()
    {
        return(p_roll);
    }

    String return_name()
    {
        return(p_name);
    }
}

class comp implements Comparator
{
    public int compare(Object ob1, Object ob2)
    {
        person pr1=(person)ob1;
        person pr2=(person)ob2;
        if(pr1.return_roll()>pr2.return_roll())
        {
            return(1);
        }
        else 
        {
            return(-1);
        }
    }
}

public class iterator_03
{
    public static void main(String []args)
    {
        person p1=new person(30, "sita");
        person p2=new person(40, "geeta");
        person p3=new person(50, "babita");
        //showing the return_name of p3
      //  System.out.println(p3.return_name());

        TreeSet t1=new TreeSet(new comp());
        t1.add(p1);
        t1.add(p2);
        t1.add(p3);

        Iterator i1=t1.iterator();
        while(i1.hasNext())
        {
            person ps=(person)i1.next();
            System.out.println(ps.return_name()+"  "+ps.return_roll());
        }
    }
}