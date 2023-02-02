import java.util.*;
import java.lang.*;

class jwellers
{
    public static void coin(int weight)  //ithala ani at madhla input variable same pahije
    {
        switch(weight)
    {
        case 1:
            System.out.println("Your bill amount is 4000");
            break;

        case 2:
            System.out.println("Your bill amount is 8000");
            break;

        case 5:
            System.out.println("Your bill amount is 20000");
            break;

        case 10:
            System.out.println("Your bill amount is 40000");
            break;

        default:
            System.out.println("Invalid weight");
    } 
       

    }
    public static void main(String arg[]) 
    {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the gold coin size that you want to purchase");
      int no = sobj.nextInt();

      coin(no);
      
    }
}
    
