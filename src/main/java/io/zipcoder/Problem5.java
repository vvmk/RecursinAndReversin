package io.zipcoder;

public class Problem5 {
    public static String reverseAndCapitalize(String input) {
        return null;
    }

    public static String reverseString(String input) {
        if (input.length() == 1)
            return input;
        else
            return input.substring(input.length()-1) + reverseString(input.substring(0, input.length()-1));
    }

    public static String capitalize(String input) {
        return null;
    }
}
