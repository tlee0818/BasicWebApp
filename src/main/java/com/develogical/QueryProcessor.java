package com.develogical;

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
            System.out.println(query);

            String[] numbers = query.split(" ");

            return String.valueOf(Integer.parseInt(numbers[2]) + Integer.parseInt(numbers[4]));
        }

        if (query.toLowerCase().contains("largest")) {
            return "extremely-basic";
        }
        return "";

    }
}
