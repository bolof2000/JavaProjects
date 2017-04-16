package Arrays.ArraySorting;

import java.util.Scanner;

/**
 * Created by BOLOFBABA on 4/15/2017.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args)
    {
        int [] arr = getNumbers(6);

        for(int i=0;i<arr.length;i++)
            System.out.println("Element at " + i + " Value is " + arr[i]);

        System.out.println("Average double is" + averageSum(arr));

        System.out.println("sorted array is "+ sortedArray(arr));


    }

    public static int[] getNumbers(int number)
    {
        System.out.println("Enter " + number +" value is .\r" );

        int[] arrValues = new int[number];
        for(int i=0;i<arrValues.length;i++)
        {
            arrValues[i] = scanner.nextInt();
        }

        return arrValues;

    }
    public static int[] sortedArray(int[] array)
    {
        int[] sortarr = new int [array.length];

        for(int i = 0;i<sortarr.length;i++)
        {
            sortarr[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while(flag)
        {
            flag = false;

            for(int i=0;i<sortarr.length-1;i++)
                if(sortarr[i]<sortarr[i+1])
                {
                    temp = sortarr[i];
                    sortarr[i] = sortarr[i+1];
                    sortarr[i+1] = temp;

                    flag = true;
                }


        }
        return sortarr;



    }





    public static double averageSum(int[] array)
    {
        int sum = 0;

        for(int i = 0;i <array.length;i++)
        {
            sum +=array[i];

        }
        return (double) sum/(double)array.length;

    }



}
