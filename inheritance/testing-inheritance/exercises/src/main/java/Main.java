public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); // prints 13

//        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

//        System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"

//        Cat salem = new Cat(8);

        Cat suki = new HouseCat("Suki", 8);

        // Calls HouseCat's noise() method
        System.out.println(suki.noise()); // Hello, my name is Suki!
//        // Results in a compiler error, since Cat doesn't have such a method
//        suki.isSatisfied();

        // As long as suki really is a HouseCat, this works
        System.out.println(((HouseCat) suki).isSatisfied());//prints true The danger here is that if suki is in fact
        // not a HouseCat (it was declared only as a Cat, after all), then we’ll experience a runtime exception. So
        // you should only cast an object to another type when you are very sure that it’s safe to do so.
    }
}
