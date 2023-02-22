package goclass;

import java.util.Scanner;

class mano
{
static int x=500; 
void get()
{
System.out.println("you are great");
}

static class sum
{
void take()
{
System.out.println("this is the inner class="+x);
}
}
}

public class innerclass_01
{
 public static void main(String []args)
{
mano.sum s1=new mano.sum();
s1.take();
// mano m1=new mano();
//mano.sum s1=m1.new sum();
//s1.take();

}
}