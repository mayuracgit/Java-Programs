import java.lang.*;
import java.util.*;

class calculator2
{
        public static void main(String arg[]) 
        {
              int res;
              boolean flag = true;

              Scanner s = new Scanner(System.in);
              while(flag)
              {
                  System.out.println("Select Operation:(+, -, *, /, exit) ");
                  String operation = s.next();
              
              if(operation.equals("exit"))
              {
                flag = false;
              }
              else
              {
                  System.out.println("Enter first number: ");
                  int no1 = s.nextInt();
                  System.out.println("Enter second number: ");
                  int no2 = s.nextInt();
              
            

              switch(operation)
              {
                    case "+": res = no1 + no2;
                              System.out.println("Addition is: "+res);
                              break;
                    case "-": res = no1 - no2;
                              System.out.println("Substraction is: "+res);
                              break;
                    case "*": res = no1 * no2;
                              System.out.println("Multiplication is: "+res);
                              break;
                    case "/": res = no1 / no2;
                              System.out.println("Division is: "+res);
                              break;
                    case "exit":
                                break;
                    default : System.out.println("Invalid Symbol");                              

                  }

                  }
            }
      }  
}