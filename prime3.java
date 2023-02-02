import java.util.*;
import java.lang.*;

class prime3
{
    public static void main(String arg[])
    {  
        int i = 0;
        int count = 0;
        Scanner sobj = new Scanner(System.in);
              
        System.out.println("Enter the number you want to check: ");
        int number = sobj.nextInt();

        if( number < 0)
        {
          System.out.println("Your number is less than 0 ");  
          return;
        }

        for(i = 2 ;i < number;i++)
        {
          if(number % i == 0)
          {
            count++;                    
          }  
        }

        if(count == 0) 
        {   
          System.out.println(number+" "+ "is prime number");                      
        }
        else
        {
        System.out.println(number+" "+ "is not prime number");
        }
          
    }
}