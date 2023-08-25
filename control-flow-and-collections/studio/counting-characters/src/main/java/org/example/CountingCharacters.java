package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CountingCharacters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a quote:");
        String quote = input.nextLine();
//        String quote = "If the product of two terms is zero then common sense says at least one of the two " +
//                "terms has to be zero to start with. So if you move all the terms over to one side, you can put " +
//                "the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] quoteArray = quote.toUpperCase().toCharArray();
       HashMap<Character, Integer> map = new HashMap<>();

       int value = 0;
            for (char c : quoteArray) {
                if (Character.isLetter(c)) {
                    if (map.containsKey(c)) {
                    value = map.get(c);
                    map.put(c, value + 1);
                    }
                    else {
                    map.put(c, 1);
                    }
            }
        }
        for (Map.Entry<Character, Integer> oneChar : map.entrySet()) {
            System.out.println(oneChar.getKey() + ":" + oneChar.getValue());
        }

    }

}
