package com.pluralsight;

import java.util.Scanner;

public class MenuExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Display menu
            System.out.println("===== Main Menu =====");
            System.out.println("1. Say Hello");
            System.out.println("2. Do Something");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("My name is  there!");
                    break;
                case 2:
                    System.out.println("Doing something...");
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    running = false; // end loop
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // add a blank line before redisplaying the menu
        }

        scanner.close();
    }
}
