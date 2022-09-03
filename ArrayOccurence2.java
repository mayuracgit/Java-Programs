import java.lang.*;
import java.util.*;


class ArrayOccurence2
{
    public static void main(String arg[])
    {
        int i = 0;
        boolean flag = false;
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
             flag = true;
             break;
          }
           
        }
        if(flag == true)
        {
           System.out.println("Element is present at index: "+ i);
        }
        else
        {
           System.out.println("Element is not present");  
        }


      }

}     

