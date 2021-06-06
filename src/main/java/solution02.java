/*
 * UCF COP3330 Summer 2021 Assignment 2 Solution
 * Copyright 2021 Alexander De Corte
 */

import java.util.Scanner;

public class solution02 {
    public static int CountLetters(String input) {
        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)))
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int letterCount = 0;

        System.out.println("What is the input string? ");
        String name = in.nextLine();

        if(name.equals("")) {
            System.out.println("You must input something.\n");
        } else {
            letterCount = CountLetters(name);
            System.out.printf("%s has %d letters. ", name, letterCount);
        }
    }
}
