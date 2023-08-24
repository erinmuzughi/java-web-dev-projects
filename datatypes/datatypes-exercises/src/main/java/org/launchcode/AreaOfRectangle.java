package org.launchcode;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the rectangle's length in inches:");
        length = input.nextDouble();

        System.out.println("Enter the rectangle's width in inches:");
        width = input.nextDouble();
        input.close();

        area = (length * width);
        System.out.println("The area of the rectangle is: " + area + " inches squared.");
    }
}