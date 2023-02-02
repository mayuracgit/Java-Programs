//Sum of  firrst n natural number

import java.lang.*;
import java.util.*;

class leap
{
  public static void main(String arg[])
  {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the year");
      long year = sc.nextLong();

      if(year % 4 == 0) 
      {
        System.out.println(year+" "+"is a leap year");
      }
      else
      {
        System.out.println(year+" "+"is a not leap year");
      }
      

  }
}
