package io.zipcoder;

public class Problem5 {
    public static String reverseAndCapitalize(String input) {
        return capitalize(reverseString(input));
    }

    public static String reverseString(String input) {

        if (input.length() == 1)
            return input;
        else
            return input.substring(input.length()-1) + reverseString(input.substring(0, input.length()-1));
    }

    public static String capitalize(String input) {
        return capitalize(input, '\u0000');
    }

    private static String capitalize(String input, char last) {
        if (input.length() == 1)
            return input;
        else if (last == '\u0000' || last == ' ')
            return input.substring(0,1).toUpperCase() + capitalize(input.substring(1), input.charAt(0));
        else
            return input.substring(0,1) + capitalize(input.substring(1), input.charAt(0));
    }
}
