package leetcode75;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class GreatestCommonDivisorOfStringsTest {

    @Test
    void gcdOfStrings_EmptyString_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            GreatestCommonDivisorOfStrings.gcdOfStrings("", "AA");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            GreatestCommonDivisorOfStrings.gcdOfStrings("AA", "");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            GreatestCommonDivisorOfStrings.gcdOfStrings("", "");
        });
    }

    @Test
    void gcdOfStrings_nullString_throwNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            GreatestCommonDivisorOfStrings.gcdOfStrings(null, "AA");
        });
        assertThrows(NullPointerException.class, () -> {
            GreatestCommonDivisorOfStrings.gcdOfStrings("AA", null);
        });
        assertThrows(NullPointerException.class, () -> {
            GreatestCommonDivisorOfStrings.gcdOfStrings(null, null);
        });
    }

    @Test
    void gcdOfStrings_commonDivisorNotExist_emptyString() {
        assertEquals(GreatestCommonDivisorOfStrings.gcdOfStrings("ABCD", "QWER"), "");
    }

    @Test
    void gcdOfStrings_oneCommonDivisorExist_greatestCommonDivisorString() {
        assertEquals(GreatestCommonDivisorOfStrings.gcdOfStrings("ABC", "ABCABC"), "ABC");
    }

    @Test
    void gcdOfStrings_moreThanOneCommonDivisorExist_greatestCommonDivisorString() {
        assertEquals(GreatestCommonDivisorOfStrings.gcdOfStrings("ABCABCABCABC", "ABCABC"), "ABCABC");
    }
}