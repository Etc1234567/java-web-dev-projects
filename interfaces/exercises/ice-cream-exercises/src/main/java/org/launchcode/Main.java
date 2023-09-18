package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        //Comparator comparator = new FlavorComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        System.out.println("Unsorted: ");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }
        System.out.println("\n");

        flavors.sort(new FlavorComparator());

        //flavors.sort(comparator);
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Sorted: ");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }
        System.out.println("\n");

        System.out.println("Before: ");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }

        System.out.println("\n");

        System.out.println("After: ");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }
    }
    }
