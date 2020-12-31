package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)  {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        /* 1
        input array size from user
            create int array in the given size
            populate the array with random numbers
            sum the array
            print the average number
         */
        System.out.println("Please enter array size:");
        int size = s.nextInt();
        int[] arr_int = new int[size];
        // populate
        for (int index = 0; index < arr_int.length; index++)
        {
            arr_int[index] = r.nextInt(1000);
        }
        // sum
        long sum = 0;
        for (int index = 0; index < arr_int.length; index++)
        {
            sum = sum + arr_int[index];
        }

        // this will make the avg float and not integer
        //double avg = (float)sum / arr_int.length;

        double avg = sum / arr_int.length;
        System.out.println(String.format("The average is: %f", avg));

        /*
        create an array of 5 Strings (hint: String[] word = new String[5])
            create a for loop and input words from the user into the array
            now print the array in a for loop
         */
        String[] words = new String[5];
        for (int index = 0; index < words.length; index++)
        {
            System.out.println("Please enter a word:");
            words[index] = s.next();
        }
        for (int index = 0; index < words.length; index++)
        {
            System.out.println(words[index]);
        }

        System.out.println("Goodbye...");
    }
}
