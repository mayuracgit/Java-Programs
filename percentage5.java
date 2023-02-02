import java.lang.*;
import java.util.*;


class percentage5
{
    public static void main(String arg[])
    {
        
        //int iPercentage;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the first number ");
        int number1 = sobj.nextInt();
        
        System.out.println("Enter the second number:");
        int number2 = sobj.nextInt();

        double Percentage = ((double)(number1 * number2) / 100);

        System.out.println("percentage of given number is: "+Percentage);

      }

}     

