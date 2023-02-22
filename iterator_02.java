import java.util.*;

class emp
{
    int e_salary;
    String e_name;
    emp(String name, int salary)
    {
        e_salary=salary;
        e_name=name;
    }

    String return_name()
    {
        return(e_name);
    }
    int return_salary()
    {
        return(e_salary);
    }
}

class comp implements Comparator
{
    public int compare(Object ob1, Object ob2)
    {
      emp ep1=(emp)ob1;
      emp ep2=(emp)ob2;
      if(ep1.return_salary()>ep2.return_salary())
      {
        return(1);
      }
      else 
      {
        return(-1);
      }
    }
}

public class iterator_02
{
    public static void main(String []args)
    {
        emp e1=new emp("big-gaj", 500);
        emp e2=new emp("sir-taj", 600);
        emp e3=new emp("adya", 300);
        System.out.println(e3.return_salary());

        TreeSet t1=new TreeSet(new comp());
        Iterator i1=t1.iterator();
        while(i1.hasNext())
        {
           emp epx=(emp)i1.next();
            System.out.println(epx.return_salary()+"  "+epx.return_name());
        }
    }
}