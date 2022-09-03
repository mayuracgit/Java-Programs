import java.lang.*;
import java.util.*;


class ArrayOccurence
{
    public static void main(String arg[])
    {
        int i = 0;
        //int iSum = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of elements");
        int number = sobj.nextInt();
        
        int Arr[] = new int[number];
        System.out.println("Enter the elements you want to include:");
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        System.out.println("Enter the number u want to search:");
        int no = sobj.nextInt();
        int cnt = 0;
        for(i = 0; i < Arr.length; i++)
        {
             
          if(Arr[i] ==  no)
          {
             cnt++;
          }
           
        }
        System.out.println("Count of   number is: "+cnt);


      }

}     

