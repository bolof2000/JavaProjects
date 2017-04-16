package Arrays;

import java.util.Scanner;

/**
 * Created by BOLOFBABA on 4/15/2017.
 */
public class SumArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args)
    {
        int [] arrs = arrayValue(10);

        for(int i=0;i <arrs.length;i++)
            System.out.println("Elements at " + i + "values " + arrs[i]);

        System.out.println("Sum Array is " + sumArr(arrs));

    }


    public static int [] arrayValue(int number)
    {
        System.out.println("Enter Element" + number + " typed value .\r");

        int [] myarrays = new int[number];
        for(int i =0; i <myarrays.length;i++)
        {
            myarrays[i] = scanner.nextInt();
        }

        return myarrays;

    }

    public static double sumArr(int [] array)
    {
        int sum = 0;
        for(int i = 0;i<array.length;i++)
        {
            sum +=array[i];
        }
        return sum;
    }




}
