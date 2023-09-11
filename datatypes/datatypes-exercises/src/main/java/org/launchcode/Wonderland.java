package org.launchcode;

import java.util.Scanner;
public class Wonderland {
    public static void main(String[] args) {

        String excerpt = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word and we will let you know if it exists in our mystery string:");
        String term = input.nextLine();

        if (excerpt.toLowerCase().contains(term.toLowerCase())) {
            System.out.println("Your word " + term.toLowerCase() + ", is in the mystery string.");
        }
        else {
            System.out.println("Nope," + term.toLowerCase() + " isn't here!");
        }
    }
}
