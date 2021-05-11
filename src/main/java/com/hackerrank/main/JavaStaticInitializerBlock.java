package com.hackerrank.main;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static Scanner input = new Scanner(System.in);

    static boolean flag = true;
    static int B ,H ;

    static {
        try {
            B = input.nextInt();
            H = input.nextInt();

            if (H < 0 || B < 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");

            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}
