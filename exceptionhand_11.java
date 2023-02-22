import java.util.Scanner;
import java.lang.ArithmeticException;

public class exceptionhand_11
{
    public static void main(String []args)
    {
        int total_balance, withdrawal_amount, left_balance;
        Scanner mano=new Scanner(System.in);
        System.out.println("enter the total balance=");
        total_balance=mano.nextInt();
        System.out.println("enter the withdral amount=");
        withdrawal_amount=mano.nextInt();
        try{
        if(withdrawal_amount>total_balance)
         throw new ArithmeticException();
        left_balance=total_balance-withdrawal_amount;
        System.out.println("left-balance="+left_balance);
        }
        catch(ArithmeticException x)
        {
            System.out.println("error amount");
            System.out.println("enter the right amount");
            withdrawal_amount=mano.nextInt();
            left_balance=total_balance-withdrawal_amount;
            System.out.println("left_balance="+left_balance);
        }   
    }
}