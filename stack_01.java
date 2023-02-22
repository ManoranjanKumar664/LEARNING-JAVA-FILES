import java.util.Stack;

public class stack_01
{
    public static void main(String []args)
    {
        Stack s1=new Stack();
        s1.push(300);
        System.out.println("pushed value="+s1.push(400));
        System.out.println("all value="+s1);
        System.out.println(s1.pop());
        System.out.println("this is value="+s1);
        //System.out.println("value="+s1.peek(0));
    }
}