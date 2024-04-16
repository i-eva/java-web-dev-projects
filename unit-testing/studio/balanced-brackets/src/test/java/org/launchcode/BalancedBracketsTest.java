package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // These strings have balanced brackets: assertTrue
    // "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"

    @Test
    public void onlyBracketsReturnsTrueOne() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsTrueTwo() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyBracketsReturnsTrueThree() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void onlyBracketsReturnsTrueFour() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void onlyBracketsReturnsTrueFive() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void onlyBracketsReturnsTrueSix() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("$teach%Weird***Code"));
    }

    //  While these do not: assertFalse
    //  "[LaunchCode", "Launch]Code[", "[", "]["

    @Test
    public void testUnbalancedBracketsReturnsFalseOne() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testUnbalancedBracketsReturnsFalseTwo() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testUnbalancedBracketsReturnsFalseThree() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testUnbalancedBracketsReturnsFalseFour() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testUnbalancedBracketsReturnsFalseFive() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[LaunchCode]"));
    }

    @Test
    public void testUnbalancedBracketsReturnsFalseSix() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]]]"));
    }

}