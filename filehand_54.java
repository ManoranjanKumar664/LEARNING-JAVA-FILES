package thispac1;

import java.util.Scanner;
import java.lang.System;

class c1
{
    void get()
    {
        System.out.println("this is the c1");
    }
}

public class filehand_54
{
    c1 ob1=new c1(){
        public void get()
        {
            System.out.println("this is the child class");
        }
    };
    
    static void sum()
    {
        System.out.println("enter any two number");
        Scanner m1=new Scanner(System.in);
        int a=m1.nextInt();
        int b=m1.nextInt();
        int c=a+b;
        System.out.println("sum="+c);
    }

    void show()
    {
        System.out.println("this is the show function");
    }
    public static void main(String []args)
    {
        filehand_54.sum();
        filehand_54 f1=new filehand_54();
        f1.show();
        f1.ob1.get();
    }
}