package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCountBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or phrase and we will count the characters! ");
        String chosenString = input.nextLine();

        char[] charArray = chosenString.toLowerCase().toCharArray();
        java.util.HashMap<Character, Integer> charCount = new HashMap<>();

        for (char letter : charArray) {
            if (charCount.containsKey(letter)){
                charCount.put(letter, charCount.get(letter) +1);
            }
            else {
                charCount.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> character : charCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
    }

