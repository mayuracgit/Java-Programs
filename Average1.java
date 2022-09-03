import java.util.*;
import java.lang.*;

class Average1 
{
    public static void main(String arg[])
    {  
        int i = 0;
        int sum = 0;
        int sum1 = 0;
        int avg = 0;
        int avg1 =0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter count of number you want to calculate aveage: ");
        int no = sobj.nextInt();

        int Arr[] = new int[no];

        for(i  = 0; i< Arr.length; i++)
        {
             Arr[i] = sobj.nextInt();
             sum1 = sum1 + Arr[i];
        }

        for(i  = 0; i< Arr.length; i++)
        {
            sum = sum + Arr[i];
            avg = sum/Arr.length;
        }
avg1 = sum1/no;
        System.out.println("Average of given numbers is: "+avg);
        System.out.println("New Average of given numbers is: "+avg1);




              
          
    }
}