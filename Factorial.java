import java.util.*;
import java.lang.*;

/*
class Factorial
{
     public static void main(String arg[])
     {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = scanner.nextInt();
        int fact = 1;

        while(no > 0)
        {
            fact = fact * no;
            no--;
        }
         System.out.println(fact);    
       }    
}



class Factorial
{
     public static void main(String arg[])
     {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = scanner.nextInt();
        int fact = 1;

        for(int i = 1; i <= no; i++)
        {
           fact = fact * i;
           System.out.println(fact);
        }  
        //System.out.println(fact); 
     }
}

*/


class Factorial
{
     static int fact = 1;
     public static void main(String arg[])
     {       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = scanner.nextInt();

        Factorial factorial = new Factorial();
        factorial.calFact(no);      // calFact la call kela.
        System.out.println("Factorial is: "+fact);
     }
     void calFact(int no)
     {
         if(no >= 1)
         {
            fact = fact*no;
            calFact(no-1);             //ithe recursive call aahe.
         }
     }
}