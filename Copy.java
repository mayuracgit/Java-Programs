import java.lang.*;
import java.util.*;

class Copy
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String: ");
        String str = sobj.nextLine();

        char Arr [] = str.toCharArray();

        int size = Arr.length;

        char Brr[] = new char[size];

        int i = 0;

        while(i != size)
        {
            Brr[i] = Arr[i];
            i++;
        }
        System.out.println(Brr);
        System.out.println(Arr.length);
        
         
    }
}