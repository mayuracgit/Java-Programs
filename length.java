import java.lang.*;
import java.util.*;

class length
{
    public static void main(String arg[])
    {
        String str = "Mayur Chaudhari";
        str = str.concat("\0");

        char Arr [] = str.toCharArray();

        int cnt = 0;
        int i = 0;

        while(Arr[i] != '\0' )
        {
            cnt++;
            i++;
        }
        System.out.println(cnt);
         
    }
}