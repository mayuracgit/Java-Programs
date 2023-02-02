import java.util.*;
import java.lang.*;

class prime2
{
     public static void main(String arg[])
     {
        
        boolean flag = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sobj.nextInt();

        for(int i = 2 ;i < number;i++)
        {
            if(number % i == 0)
            {
                System.out.println("Number is not prime");
                flag = true;
                break; 
            } 
            else
            {
                System.out.println("Number is prime");
                break;

            }
        }          
               
       }
     
}



