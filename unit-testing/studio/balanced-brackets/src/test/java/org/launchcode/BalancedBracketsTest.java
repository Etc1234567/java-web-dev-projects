package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    String test_word;
    @BeforeEach
    public void createTestWord() {
        test_word = "[Banana]";
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

// write codes below here:
    @Test
    public void nullTest() {
        assertNotNull(test_word);
    }

    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void oneBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertnotNull(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("[]", "[]"));
    }
    @Test
    public void noBrackets() {
        String bracketless = "Nope";
        assertFalse(BalancedBrackets.hasBalancedBrackets(bracketless));
    }

    @Test
    public void inTheMiddle() {
        String test = "Ban[ana";
        assertFalse(BalancedBrackets.hasBalancedBrackets(test));
    }

    @Test
    public void unbalanced() {
        String unbalancedString = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(unbalancedString));
    }

    @Test
    public void unbalancedInString() {
        String launch = "Launch]Code[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(launch));
    }

    @Test
    public void emptyString() {
        String empty = "";
        assertTrue(BalancedBrackets.hasBalancedBrackets(empty));
    }

}