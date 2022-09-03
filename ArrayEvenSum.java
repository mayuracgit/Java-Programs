import java.lang.*;
import java.util.*;


class ArrayEvenSum
{
    public static void main(String arg[])
    {
        int i = 0;
        int iSum = 0; 
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of elements");
        int number = sobj.nextInt();
        
        int Arr[] = new int[number];
        System.out.println("Enter the elements you want to include:");
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        int evenCnt = 0;
        //System.out.println("Even number from given array are: ");
        for(i = 0; i < Arr.length; i++)
        {
             
          if((Arr[i] % 2) ==  0)
          {
             evenCnt++;
             iSum = iSum + Arr[i];
          }
           
        }
        System.out.println("Count of even  number is: "+evenCnt);
        System.out.println("Sum of even  number is: "+iSum);


      }

}     

