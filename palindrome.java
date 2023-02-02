import java.lang.*;
import java.util.*;

class palindrome
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String: ");
        String str = sobj.nextLine();

        char original[] = str.toCharArray();

        int size = original.length;

        char reverse[] = new char[size];

        int i = 0;

        while(i != size)
        {
            reverse[size-1-i] = original[i];   //size he 1 ne jast asel because index detana apn 0 pasun deto
            i++;
        }

        i = 0;
        while(i != size)
        {
            if(reverse[i] != original[i])  //mhajech reverse kelelya string cha first char and original cha first char same nasel tr palindrome anhi.
            {
                System.out.println(str+" "+"is not palindrome ");
                break;
            }
            else
            {
                i++;
               // continue;           //ha continue tkal nahi tr...

            }

        }
        System.out.println("string is palindrome ");
        
         
    }
}