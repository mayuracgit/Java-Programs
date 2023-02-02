import java.lang.*;
import java.util.*;


class percentage4
{
    public static void main(String arg[])
    {
        
        int iPercentage;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the first number ");
        int number1 = sobj.nextInt();
        
        System.out.println("Enter the second number:");
        int number2 = sobj.nextInt();

        iPercentage = (number1 * 100) / number2;

        System.out.println("percentage of given number is: "+iPercentage);

      }

}     

