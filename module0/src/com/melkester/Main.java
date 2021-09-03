package com.melkester;

public class Main {

    public static void main(String[] args) {

        String name = "Hot dog";
        int x = 5;

        while (x != 0) {
            System.out.println(x + " " + name);
            x--;
        }

        System.out.println("while loop is successful");

        for (int i = 0; i < 5; i++) {
            System.out.println("There are " + i + " " + name);
        }

        System.out.println("for loop is successful!");
    }
}
