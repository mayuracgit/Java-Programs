import java.util.*;
import java.lang.*;

class oddeven3
{
    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter an integer.");
      int x = in.nextInt();
      boolean even;
     
        if ((x / 2) * 2 == x) 
        {
            even = true;
            System.out.println(x + " is even.");
        }
        if ((x / 2) * 2 != x) 
        {
            even = false;
            System.out.println(x + " is odd.");
        }
    }
}
    
