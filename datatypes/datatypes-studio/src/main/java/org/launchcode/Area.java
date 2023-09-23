package org.launchcode;
import java.util.Scanner;

public class Area {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");

    if (input.hasNextDouble()) {
        double radius = input.nextDouble();

        if (radius > 0) {
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is " + area);
        }
           else  {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }
    else {
        System.out.println("Invalid input. Please enter a number.");
    }
    input.close();
    }
}

