package org.launchcode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        boolean isValidNum = false;
        radius = input.nextDouble();

        try {
            while (!isValidNum)
                if (radius < 0) {
                    System.out.println("Enter a positive number for a radius!");
                    radius = input.nextDouble();
                } else {
                    isValidNum = true;
                    area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is " + area + ".");
                }
        } catch (InputMismatchException e) {
            System.out.println("Not a valid input! Quitting.");
        }
        input.close();
    }
}