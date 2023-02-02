import java.lang.*;
import java.util.*;

class palindrome2
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
            reverse[size-1-i] = original[i];
            i++;
        }
        
        boolean flag = false;
        if(Arrays.equals(original,reverse))
        {
            flag =  true;
               
        }
        if(flag == true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not");
        }
        

        
        
        
         
    }
}