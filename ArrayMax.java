import java.lang.*;
import java.util.*;


public class ArrayMax
{
      public static void main(String arg[])
      {
        /**
        
        Scanner sobj = new Scanner(System.in);
         int size = sobj.nextInt();

         int Arr = new int[size];

         */
         
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of array");
        int number = sobj.nextInt();
        
        int Arr[] = new int[number];
        System.out.println("Enter the elements you want to include:");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        int max = Arr[0];
        for(int i = 0; i < Arr.length; i++)                                     
        {
           if(Arr[i] > max)
           {
             max = Arr[i];
           }
        }

        System.out.println("Max number from array is : "+max);

         
      }

     

      

}