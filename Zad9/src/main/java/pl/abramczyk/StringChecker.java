package pl.abramczyk;

import java.util.Arrays;
import java.util.Locale;

import static java.util.Arrays.*;

public class StringChecker {

    public static boolean  checkIfStringsMatch(String s1, String s2) {
        boolean result = true;
        if (s1.length() != s2.length()) {
            result = false;
        } else {
            char[] tabS1 = s1.toLowerCase().toCharArray();
            char[] tabS2 = s2.toLowerCase().toCharArray();
            sort(tabS1);
            sort(tabS2);
            result = Arrays.equals(tabS1, tabS2);
        }
        return result;
    }
}
