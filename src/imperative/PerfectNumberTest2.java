package imperative;

import org.junit.Test;

import static imperative.PerfectNumber2.STATE.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PerfectNumberTest2 {

    @Test
    public void test6Perfect() {
        assertEquals(PERFECT, PerfectNumber2.process(6));
    }

    @Test
    public void test8Deficient() {
        assertEquals(DEFICIENT, PerfectNumber2.process(8));
    }

    @Test
    public void test20Abundant() {
        assertEquals(ABUNDANT, PerfectNumber2.process(20));
    }

    @Test
    public void test16DeficientWithIntSqrt() {
        assertEquals(DEFICIENT, PerfectNumber2.process(16));
    }

    @Test
    public void test1Deficient() {
        assertEquals(DEFICIENT, PerfectNumber2.process(1));
    }

    @Test
    public void testDivisors1() {
        Object[] expected = new Integer[] { 1 };
        int n = 1;
        assertArrayEquals(expected, PerfectNumber2.divisors(n).toArray());
    }

    @Test
    public void testDivisors6() {
        Object[] expected = new Integer[] { 1, 2, 3, 6 };
        int n = 6;
        assertArrayEquals(expected, PerfectNumber2.divisors(n).toArray());
    }

    @Test
    public void testDivisors8() {
        Object[] expected = new Integer[] { 1, 2, 4, 8 };
        int n = 8;
        assertArrayEquals(expected, PerfectNumber2.divisors(n).toArray());
    }
}
