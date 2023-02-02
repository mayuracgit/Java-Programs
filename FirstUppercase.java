import java.lang.*;
import java.util.*;

class FirstUppercase
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String: ");
        String str = sobj.nextLine();

        char upper[] = str.toCharArray();

        int size = upper.length;

        
        upper[0] = (char)(upper[0] - 32);
        int i = 1;
        while(i != size)
        {
            if(upper[i] == ' ')
            {
                upper[i+1] = (char)(upper[i+1] - 32);
            }
            i++;
        }
        System.out.println("Original string: "+str);
       // System.out.println("string with lowercase: "+upper);
       System.out.println(upper);
        
        
        

        
        
        
         
    }
}