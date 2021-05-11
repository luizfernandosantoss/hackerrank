package com.hackerrank.main;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        System.out.println(new StringBuilder(a).reverse().toString().equalsIgnoreCase(a)  ? "Yes" : "No" );
    }
}
