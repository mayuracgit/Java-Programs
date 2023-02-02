import java.lang.*;
import java.util.*;

class SwapString
{
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);
       // int len1,len2;
        System.out.println("Enter first String: ");
        String str1 = sobj.nextLine();
        
        System.out.println("Enter second String: ");
        String str2 = sobj.nextLine();

        System.out.println("before swap " + str1 + " " +str2);

        str1 = str1+str2;

        str2= str1.substring(0, str1.length() - str2.length());    //(start point , end point --->) //o start asel ani str2 cha last letter ha end point asel mg // total length madhun aplyala str2 kami karavi lagel.

        str1 = str1.substring(str2.length());    // ani s1 madhe apn direct s2 takun deu.

        System.out.println("After swap " + str1 + " " +str2);
    }
}



       

        


        
        /*
        
 len1=str1.length();
        len2=str2.length();


        
        str1= str1.substring((len2+1));

        System.out.println("string2 is " + str2);
        System.out.println("string1 is " + str1);

        System.out.println("string is " + str1);
       //.len1=str1.length();
        len2=str2.length();
      
        
        str1= str1.substring(len2);
        System.out.println("string2 is " + str2);
        System.out.println("string1 is " + str1);

        */
         
    
