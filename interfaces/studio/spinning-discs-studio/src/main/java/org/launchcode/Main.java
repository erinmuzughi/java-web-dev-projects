package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd1 = new CD ("cd", 200.0, 530.0, "Taylor Swift", "Folklore");
        DVD dvd1 = new DVD ("dvd",570.0, 1600.0, "The Little Mermaid", "Fairy tale","2:15", "Rated G" );
        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd1.describe();
        cd1.spinDisc();

        dvd1.describe();
        dvd1.spinDisc();
    }
}