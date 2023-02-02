import java.lang.*;
import java.util.*;

class Fibonacci
{
      public static void main(String arg[])
      {
        int a = 0;
        int b = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to print: ");
        int count  = scanner.nextInt();
        count = count-2;
        System.out.print(a+" "+b);
        
        for(int i = 1; i <= count; i++)
        {
            int c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }

      }  
}

