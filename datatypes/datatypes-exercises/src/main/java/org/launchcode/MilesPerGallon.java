package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles driven:");
        Double miles = input.nextDouble();

        System.out.println("Enter the number of gallons of gas consumed during your trip:");
        Double gallons = input.nextDouble();

        Double milesPerGallon = miles/gallons;

        System.out.println("Your number of miles per gallon is " + milesPerGallon);
    }
}
