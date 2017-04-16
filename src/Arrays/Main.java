package Arrays;

import java.util.Scanner;

/**
 * Created by BOLOFBABA on 4/15/2017.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args)
    {
        int[] myint = getIntegers(6);

        for(int i=0;i<myint.length;i++)
            System.out.print("element"+ i +myint[i]);

        System.out.println("Average is"+ getAverage(myint));

    }



    public static int[] getIntegers(int number)
    {
        System.out.println("Type " + number + " values \r");
        int[] values = new int[number];
        for(int i=0;i<values.length;i++)
        {
            values[i] = scanner.nextInt();
        }

        return values;

    }


    public static double getAverage(int [] array)
    {
        int sum = 0;
        for(int i =0;i<array.length;i++)
        {
            sum +=array[i];
        }
        return (double)sum/(double)array.length;
    }


    }





