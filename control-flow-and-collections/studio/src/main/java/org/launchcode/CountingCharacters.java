package org.launchcode;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String sampleString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charArray = sampleString.toLowerCase().toCharArray();
HashMap<Character, Integer> charCount = new HashMap<>();

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
