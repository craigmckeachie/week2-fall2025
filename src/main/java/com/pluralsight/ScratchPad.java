package com.pluralsight;

public class ScratchPad {

    public static void main(String[] args) {

        int[] arr = { 1,2,3};


        String str1 = "a";
        String str2 = "" + str1;


        if (str1 == str2) {
            System.out.println(true);
        }

        if (str1.equals(str2)) {
            System.out.println(true);
        }
    }
}
