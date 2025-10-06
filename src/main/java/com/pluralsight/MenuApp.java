package com.pluralsight;

import java.util.Scanner;

public class MenuApp {

    // Shared scanner for the entire app
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runMainMenu();
        scanner.close();
    }

    // Main menu loop
    public static void runMainMenu() {
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim().toUpperCase(); // normalize input

            switch (choice) {
                case "A":
                    sayHello();
                    break;
                case "B":
                    doSomething();
                    break;
                case "X":
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // blank line for spacing
        }
    }

    // Display menu
    public static void displayMenu() {
        System.out.println("===== Main Menu =====");
        System.out.println("A. Say Hello");
        System.out.println("B. Do Something");
        System.out.println("X. Exit");
    }

    // Example menu actions
    public static void sayHello() {
        System.out.println("Hello there!");
    }

    public static void doSomething() {
        System.out.println("Doing something...");
    }
}

