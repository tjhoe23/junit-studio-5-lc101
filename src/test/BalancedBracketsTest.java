package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
public class BalancedBracketsTest {

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); //1
        assertTrue(BalancedBrackets.hasBalancedBrackets("")); //2
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]")); //3
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]")); //4
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode")); //5
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]")); //6
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]")); //7
    }


    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[")); //8
        assertFalse(BalancedBrackets.hasBalancedBrackets("]")); //9
        assertFalse(BalancedBrackets.hasBalancedBrackets("][[")); //10
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode")); //11
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[")); //12

    }
}
