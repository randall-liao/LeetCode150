package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfAString {

    private static final boolean[] VOWELS = new boolean[128]; // ASCII size

    static {
        // Precomputed boolean array for ASCII vowels
        VOWELS['a'] = true;
        VOWELS['e'] = true;
        VOWELS['i'] = true;
        VOWELS['o'] = true;
        VOWELS['u'] = true;
        VOWELS['A'] = true;
        VOWELS['E'] = true;
        VOWELS['I'] = true;
        VOWELS['O'] = true;
        VOWELS['U'] = true;
    }

    private static boolean isVowel(char ch) {
        if (ch < VOWELS.length) { // Ensure character is within the array bounds
            ch = Character.toLowerCase(ch);
            return VOWELS[ch];
        }
        throw new IllegalArgumentException("Non ASCII Char");
    }

    public String reverseVowels(String s) {
        if (s == null) throw new IllegalArgumentException("Null input");
        List<VowelPair> vowelsPairList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowelsPairList.add(new VowelPair(i, s.charAt(i)));
            }
        }
        // Reconstruct result String
        StringBuilder resultStringBuilder = new StringBuilder(s);
        int tailPointer = vowelsPairList.size() - 1;
        for (VowelPair headVowelPair : vowelsPairList) {
            // shuffle the tail vowel with the head vowel
            VowelPair tailVowelPair = vowelsPairList.get(tailPointer);
            resultStringBuilder.setCharAt(headVowelPair.index, tailVowelPair.vowel);
            tailPointer--;
        }
        return resultStringBuilder.toString();
    }

    private record VowelPair(Integer index, Character vowel) {
    }
}
