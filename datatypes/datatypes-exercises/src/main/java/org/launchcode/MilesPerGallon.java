package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallon;
        double milesPerGallon;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven:");
        miles = input.nextDouble();

        System.out.println("Enter the amount of gas your vehicle has used to travel that distance (in gallons):");
        gallon = input.nextDouble();
        input.close();

        milesPerGallon = miles/gallon;
        System.out.println("Your vehicle uses " + milesPerGallon + "miles/gallon.");
    }
}

