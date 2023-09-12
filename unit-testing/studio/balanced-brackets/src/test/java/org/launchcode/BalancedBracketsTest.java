package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: returns true if string includes only brackets []
    @Test
    public void onlyBracketsReturnsTrue() {
        String msg = "string only contains balanced brackets";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), msg);
    }

    //TODO: returns true if string includes multiple balanced brackets []
    @Test
    public void multipleBracketsReturnsTrue() {
        String msg = "string contains multiple balanced brackets";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] [] []"), msg);
    }
//TODO: returns true if a string includes other characters with balance brackets
    @Test
    public void includesBracketsReturnsTrue() {
        String msg = "string includes other characters and balanced brackets";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"), msg);
    }
    //TODO: returns true if a string is empty
    @Test
    public void emptyStringReturnsTrue() {
        String msg = "empty string returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets(""), msg);
    }
    //TODO: returns false if a string only contains an opening bracket
    @Test
    public void onlyOpeningBracketReturnsFalse() {
        String msg = "string contains only an opening bracket";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"), msg);
    }
    //TODO: returns false if a string has characters and only contains an closing bracket
    @Test
    public void containsCharClosingBracketReturnsFalse() {
        String msg = "string contains other characters and only a closing bracket";
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"), msg);
    }
    //TODO: only an opening bracket "["
    @Test
    public void containsOnlyOpeningBracketReturnsFalse() {
        String msg = "string contains only opening bracket";
        assertFalse(BalancedBrackets.hasBalancedBrackets("["), msg);
    }
    //TODO: returns false if a string only contains an closing bracket
    @Test
    public void onlyClosingBracketReturnsFalse() {
        String msg = "string contains only an closing bracket";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"), msg);
    }
    //TODO: returns false if a string contains one set of mismatched brackets
    @Test
    public void containsSetOfMismatchedBracketReturnsFalse() {
        String msg = "string contains one set of out of order brackets";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["), msg);
    }
    //TODO: returns false if a string contains a set and an additional opening bracket
    @Test
    public void containsExtraOpeningBracketReturnsFalse() {
        String msg = "string contains extra opening out of order brackets";
        String testStr = "[][][[][]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testStr), msg);
    }
    //TODO: returns false if a string contains a set and an additional closing bracket
    @Test
    public void containsExtraClosingBracketReturnsFalse() {
        String msg = "string contains extra closing out of order brackets";
        String testStr = "[][]][][]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testStr), msg);
    }
    //TODO: contains mismatched with other characters
    @Test
    public void containsOtherCharMisMatchedBracketReturnsFalse() {
        String msg = "string contains other characters and mismatched brackets";
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["), msg);
    }



}

