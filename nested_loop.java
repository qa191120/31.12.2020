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
    }
}
