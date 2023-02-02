import java.lang.*;
import java.util.*;

class Findlength
{
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String: ");
        String str = sobj.nextLine();

        str = str.concat("\0");

        char Arr [] = str.toCharArray();

        int cnt = 0;
        int i = 0;

        while(Arr[i] != '\0' )
        {
            cnt++;
            i++;
        }
        System.out.println("Length of string is"+cnt);
         
    }
}