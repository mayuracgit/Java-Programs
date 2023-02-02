import java.lang.*;
import java.util.*;

class vovel
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String: ");
        String str = sobj.nextLine();

        str = str.toUpperCase();

        int vovel = 0;
        int conso = 0;

        for(int i = 0;i < str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch != ' ')
            {
                if((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))
                {
                    vovel++;
                }
                else
                {
                    conso++;
                }
            
            }
                
        }
        System.out.println("count of vovels in the string are: " +vovel);
        System.out.println("count of consonents in the string are: " +conso);
      
    }
}