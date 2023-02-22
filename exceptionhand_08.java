import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class exceptionhand_08
{
    public static void main(String []args)
    { 
        File mano2=new File(".\\io4.cpp");
        try{ 
       // File mano2=new File(".\\io3.cpp");
        mano2.createNewFile();
        }
        catch(IOException e)
        { 
           System.out.println("this is me");
        }
         System.out.println("hello");
       //  throw new IOException();
       // System.out.println("this is me");
    }
}