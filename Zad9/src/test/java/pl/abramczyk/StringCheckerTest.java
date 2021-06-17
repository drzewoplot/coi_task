package pl.abramczyk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCheckerTest {


    @Test
    public void shouldReturnTrueWhenStringsMatch(){
        String s1 = "MARA";
        String s2 = "RAMA";
        assertTrue(StringChecker.checkIfStringsMatch(s1,s2));
    }

    @Test
    public void shouldReturnFalseWhenStringsDontMatch(){
        String s1 = "asfs";
        String s2 = "RAMA";
        assertFalse(StringChecker.checkIfStringsMatch(s1,s2));
    }

    @Test
    public void shouldIgnoreCase(){
        String s1 = "MARA";
        String s2 = "rama";
        assertTrue(StringChecker.checkIfStringsMatch(s1,s2));
    }

    @Test
    public void shouldReturnFalseWhenStringsAreOfDifferentLength(){
        String s1 = "MARA";
        String s2 = "MAR";
        assertFalse(StringChecker.checkIfStringsMatch(s1,s2));
    }

    @Test
    public void shouldReturnTrueWhenNumericValuesMatch(){
        String s1 = "997";
        String s2 = "799";
        assertTrue(StringChecker.checkIfStringsMatch(s1,s2));
    }
}