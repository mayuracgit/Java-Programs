import java.lang.*;
import java.util.*;

class Copy2 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String: ");
        String str = sobj.nextLine();
        str = str.concat("\0");

        char Arr [] = str.toCharArray();

        int size = Arr.length;

        char Brr[] = new char[size];

        int i = 0;

        while(i != '\0' )    //while(i != size-1 ) 
        {
            Brr[i] = Arr[i];
            i++;
        }
        System.out.println(Brr);
         
    }
}

// '\0' takala tr size-1 chalel.