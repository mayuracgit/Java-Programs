import java.util.*;
import java.lang.*;

class oddevensum
{
    public static void main(String arg[])
    {  
        int i= 0;
        int sum = 0;
        Scanner sobj = new Scanner(System.in);

          System.out.println("Enter the range : ");
          int range = sobj.nextInt();

          System.out.println("Even numbers are: "); 
          for(i = 0; i <= range;i++)
          {

          if((i % 2) == 0 )
          {
            System.out.println(+i);
            sum = sum + i;
            
          }
          
        }
        
        System.out.println("sum of numbers  even: "+sum);
    }
    
}