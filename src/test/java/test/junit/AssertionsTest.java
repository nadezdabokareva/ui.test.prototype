package test.junit;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.common.math.IntMath;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testObjectCreation() {
        String str = "Hello, World!";
        assertNotNull(str, "Object should not be null");
    }
    @Test
    public void testArrayEquality() {
        int[] expectedArray = {1, 2, 3};
        int[] resultArray = {1, 2, 3};
        assertArrayEquals(expectedArray, resultArray, "Arrays should be equal");
    }

//    @Test
//    public void testAddition() {
//        ArrayNode Calculator = null;
//        int result = Calculator.add(2, 3);
//        assertEquals(5, result, "Expected result should be 5");
//    }
//    @Test
//    public void testAddition2() {
//        ArrayNode Calculator = null;
//        int result = Calculator.add(2, 3);
//        assertNotEquals(5, result, "Expected result should be 5");
//    }
//    @Test
//    public void testIsPrimeNumber() {
//        IntMath MathUtils;
//        assertTrue(MathUtils.isPrime(7), "Expected number to be prime");
//    }
//    @Test
//    public void testIsPrimeNumber() {
//        IntMath MathUtils = null;
//        assertFalse(MathUtils.isPrime(7), "Expected number to be prime");
//    }

}
