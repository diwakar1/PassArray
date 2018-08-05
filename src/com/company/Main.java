package com.company;

import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {

        int [] numbers = new int[5];
        getNumbers(numbers);
        System.out.println("here are the numbers you entered: ");
        showNumbers(numbers);
    }

    // asks user to put to enter value for each argument
    public static void getNumbers(int[]array)
    {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(" numbers: " + (i+1) + " " );
            array[i] = input.nextInt();



        }



    }
      // this display contents
    public static void showNumbers(int[]array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

}
