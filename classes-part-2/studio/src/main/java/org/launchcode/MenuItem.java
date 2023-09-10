package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
//    private boolean isNew;
    private final LocalDate dateAdded;

    public MenuItem(String n, double p, String d, String c) {
        this.name = n;
        this.description = d;
        this.price = p;
        this.category = c;
        this.dateAdded = LocalDate.now();
    }

//GETTERS AND SETTERS

    public String getName() {
        return name; }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description; }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    //TO DO: Define Custom toString() method to print menu items

//TO DO: Define custom equals() method to compare if a menu item already exists on the menu

//TO DO: Define custom instance method to determine isNew()

    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded(). until(today, ChronoUnit.DAYS);
        return daysBetween < 90; //is the # of days between less than 90? True or false?
    }
}







