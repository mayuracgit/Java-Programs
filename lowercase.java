import java.lang.*;
import java.util.*;

class lowercase
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String: ");
        String str = sobj.nextLine();

        char lower[] = str.toCharArray();

        int size = lower.length;

        

        int i = 0;

        while(i != size)
        {
            lower[i] = (char)(lower[i] - 32);
            i++;
        }
        System.out.println("Original string: "+str);
        System.out.println("string with lowercase: "+lower);
        System.out.println(lower);
        
        
        

        
        
        
         
    }
}