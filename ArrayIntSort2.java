import java.lang.*;
import java.util.Arrays;

class ArrayIntSort2
{
    public static void main(String arg[])
    {
        int iCnt = 0;
        int marks[] = new int[5];

       marks[0] = 60;
       marks[1] = 20;
       marks[2] = 30;
       marks[3] = 40;
        marks[4] = 50;

       // System.out.println(marks[0]); 
        Arrays.sort(marks);
        for(iCnt = 0; iCnt < marks.length; iCnt++)
        {
            System.out.println(marks[iCnt]);
        } 
       

    }
}