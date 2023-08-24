package org.launchcode;

import java.util.Scanner;
public class AliceInWonderland {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or " +
                "conversation?’";
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Please enter a search term:");

        String searchTerm = input.nextLine();
        searchTerm = searchTerm.toLowerCase();
        firstSentence = firstSentence.toLowerCase();

        if (firstSentence.contains(searchTerm)) {
            System.out.println("true");
            Integer index = firstSentence.indexOf(searchTerm);
            Integer wordLength = searchTerm.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + wordLength + " characters long.");
            String modifiedFirstSentence = firstSentence.replace(searchTerm, "");
            System.out.println(modifiedFirstSentence);

        }


    }
}
