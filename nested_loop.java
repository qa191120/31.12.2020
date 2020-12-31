package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)  {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 5; column++) {
                System.out.print(column);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("==========================");

        int row = 0;
        do {
            row++;
            int col = 0;
            do {
                System.out.print(col);
                System.out.print(" ");
                col++;
                if (col == 5) {
                    break;
                }
            } while(true);
            System.out.println();
            if (row == 3)
            {
                break;
            }
        } while(true);

        System.out.println();
        System.out.println("Goodbye...");

        // targil:
        // 1
        // create and print 3x10 random numbers
        // each row will have 10 random numbers
        // 2
        // input from user number of rows
        // input from user number of columns
        // print the following:
        // i.e. 4 rows and 5 column:
        // 1   2  3  4  5
        // 6   7  8  9 10
        // 11 12 13 14 15
        // 16 17 18 19 20
        // 3
        // *etgar:
        // input from user number of rows
        // input from user number of columns
        // print the following:
        // i.e. 2 rows and 5 column:
        // print row x column (not multiply, just letter 'x'), hint:use format
        // attention: not zero based
        // 1x1 1x2 1x3 1x4 1x5
        // 2x1 2x2 2x3 2x4 2x5
        
        
    }
}
