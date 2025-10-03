package com.pluralsight;

public class ArrayForLoopExample {

    public static void main(String[] args) {
        int[] numbers = {54,77,88,99,12,83};

        for (int index=0;index< numbers.length ;index = index+1) {
            int currentNumber = numbers[index];
            System.out.println(currentNumber);
        }

       // int is the data type for one element in the array
      //currentNumber is the name for one element or item in the array, you get to name it, it should be singular
      //:
      //  array/list (plural)
//        for (int currentNumber: numbers) {
//            System.out.println(currentNumber);
//        }
    }
}
