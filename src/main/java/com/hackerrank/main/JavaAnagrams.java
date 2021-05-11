package com.hackerrank.main;

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        char[] charsA = a.toLowerCase().toCharArray();
        char[] charsB = b.toLowerCase().toCharArray();
        selectionSort(charsA);
        selectionSort(charsB);
        return String.valueOf(charsA).equals(String.valueOf(charsB));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    public static void selectionSort(char[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            char menorChar = arr[index];
            arr[index] = arr[i];
            arr[i] = menorChar;
        }
    }
}
