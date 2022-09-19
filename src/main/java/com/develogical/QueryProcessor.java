package com.develogical;

import java.util.*;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("name")) {
            return "extremely-basic";
        }

        if (query.toLowerCase().contains("plus")) {

            String[] numbers = query.split(" ");

            return String.valueOf(Integer.parseInt(numbers[3]) + Integer.parseInt(numbers[5]));
        }
        if (query.toLowerCase().contains("mult")) {

            String[] numbers = query.split(" ");

            return String.valueOf(Integer.parseInt(numbers[3]) * Integer.parseInt(numbers[6]));
        }

        if (query.toLowerCase().contains("largest")) {
            List numbers = Arrays.asList(query.split(" "));

            return String.valueOf(numbers.get(0));
        }
        return "";

    }
}
