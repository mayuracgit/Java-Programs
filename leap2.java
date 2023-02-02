//Sum of  firrst n natural number

import java.lang.*;
import java.util.*;

class leap2
{
  public static void main(String arg[])
  {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the year");
      long year = sc.nextLong();

      if((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
      {
        System.out.println(year+" "+"is a leap year");
      }
      else
      {
        System.out.println(year+" "+"is a not leap year");
      }
      

  }
}
