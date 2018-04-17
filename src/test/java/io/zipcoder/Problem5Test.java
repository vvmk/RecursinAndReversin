package io.zipcoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem5Test {
    @Test
    void testReverseOneWord() {
        String input = "Reverse";

        String expected = "esreveR";
        String actual = Problem5.reverseString(input);

        assertEquals(expected, actual);
    }

    @Test
    void testCapitalizeOneWord() {
        String input = "capital";

        String expected = "Capital";
        String actual = Problem5.capitalize(input);

        assertEquals(expected, actual);
    }

    @Test
    void testReverseAndCapitalizeWord() {
        String input = "reverseandcap";

        String expected = "Pacdnaesrever";
        String actual = Problem5.reverseAndCapitalize(input);

        assertEquals(expected, actual);
    }


    @Test
    void testReverseAndCapitalizeSentence() {
        String input = "What a mess this one is";

        String expected = "Si Eno Siht Ssem A Tahw";
        String actual = Problem5.reverseAndCapitalize(input);

        assertEquals(expected, actual);
    }
}
