package com.pluralsight;

public class Escaping {
    public static void main(String[] args) {
        String welcome = "Big Tex says \"Howdy\"";
        System.out.println(welcome);

        String message = "This is a message.\nIt goes on and on blah, blah, blah.";
        System.out.println(message);

        String message1 = """ 
                          This is a message.
                          It goes on and on blah, blah, blah.
                          Another line.
                          """;

        System.out.println(message1);
        runComparingStringsExample();




    }

    public static void runComparingStringsExample(){
        String s1 = "ABC";
        String s2 = "abc";

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("They are equal");
        }

    }


}
