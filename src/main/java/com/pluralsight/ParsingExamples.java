package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingExamples {
    public static void main(String[] args) {
        //Parse String to Int
        String numberAsString = "45";
        int number = Integer.parseInt(numberAsString);
        int result =  number + 1;
        System.out.println(result);


        //Parse String to Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String userInput = "10/17/2022";
        LocalDate birthDay = LocalDate.parse(userInput, formatter);
        System.out.println(birthDay.getDayOfWeek());


    }
}
