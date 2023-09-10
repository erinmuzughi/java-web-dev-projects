package org.launchcode;

public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Smashburger", 10.0, "Two 1/4 lb patties, smashes and grilled to perfection, topped with cheddar cheese and LTOP; served with house cut fries and our famous aoili", "main course");
        MenuItem item2= new MenuItem("Signature Pizza", 15.0, "14 inch hand-tossed pepperoni pizza -- get it traditional or try it Muzughi style with alfredo and pepperjack cheese", "main course");
        MenuItem item3 = new MenuItem("Carnitas Tacos", 13.0, "3 slow-cooked pork carnitas tacos, served with picked red onions, house-made crema, cilantro and pico de gallo with cilantro lime rice, chips and guac", "main course");
        MenuItem item4 = new MenuItem("Pineapple Upside Down Cake", 8.0, "A family recipe, this generous slice of cake is served with french vanilla ice cream, enough to share", "dessert");
        MenuItem item5 = new MenuItem("T-Ravs", 7.0, "A St. Louis staple, choose cheese or beef or a combo", "appetizer");

        System.out.println(item1.isNew());
    }
}
