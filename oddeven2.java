import java.util.*;
import java.lang.*;

class oddeven2
{
    public static void main(String arg[])
    {
        boolean flag = true;
        Scanner sobj = new Scanner(System.in);

      
            System.out.println("Enter the number u want to check: ");
            int number = sobj.nextInt();

            if( number <= 1)
            {
              return;
            }

            if((number % 2) == 0 )
            {
              System.out.println("Your number is even ");
            }
            else
            {
              System.out.println("Your number is odd ");
            }
        }
    }
