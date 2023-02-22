import java.util.*;

class student
{
    int s_roll;
    String s_name;
    student(int roll, String name)
    {
        s_roll=roll;
        s_name=name;
    }

    String return_name()
    {
        return(s_name);
    }

    int return_roll()
    {
        return(s_roll);
    }
}

class comp implements Comparator
{
    public int compare(Object st1, Object st2)
    {
       student one1=(student)st1;
       student one2=(student)st2;
       if(one1.return_roll()>one2.return_roll())
       {
        return(1);
       }
       else 
       {
        return(-1);
       }
    }
}
public class iterator_01
{
    public static void main(String []args)
    {
        student s1=new student(1,"ram");
        student s2=new student(2,"sam");
        student s3=new student(3,"aam");
        System.out.println(s1.return_name());
        System.out.println(s3.return_roll());
        TreeSet t1=new TreeSet(new comp());
        t1.add(s1);
        t1.add(s2);
        t1.add(s3);
        Iterator i1=t1.iterator();
        while(i1.hasNext())
        {
            student s=(student)i1.next();
            System.out.println(s.return_roll()+" of "+s.return_name());
        }
    
        /*
        TreeSet mano=new TreeSet();
        mano.add("metal_haven");
        mano.add("first_blood");
        mano.add("occult_chambers");
        System.out.println(mano);
        Iterator it=mano.iterator();
        while(it.hasNext())
        {
            String s=(String)it.next();
            System.out.println(s);
        } */
    }
}