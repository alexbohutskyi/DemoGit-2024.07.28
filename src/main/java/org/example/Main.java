package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Git flow - система роботи з Гітом
        System.out.printf("New feature development...");
        System.out.printf("Release new feature");


        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        login();
    }

    public static void login() {
        String username = "Mykola";
        String password = "qwerty";

        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
}