package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiceCombinationsTest {

    @Test
    public void testDiceCombinations1() {
        assertEquals(1, DiceCombinations.diceCombinations(1));
    }

    @Test
    public void testDiceCombinations2() {
        assertEquals(2, DiceCombinations.diceCombinations(2));
    }

    @Test
    public void testDiceCombinations3() {
        assertEquals(4, DiceCombinations.diceCombinations(3));
    }

    @Test
    public void testDiceCombinations4() {
        assertEquals(8, DiceCombinations.diceCombinations(4));
    }

    @Test
    public void testDiceCombinations5() {
        assertEquals(16, DiceCombinations.diceCombinations(5));
    }

    @Test
    public void testDiceCombinations6() {
        assertEquals(32, DiceCombinations.diceCombinations(6));
    }

    @Test
    public void testDiceCombinations7() {
        assertEquals(63, DiceCombinations.diceCombinations(7));
    }

    @Test
    public void testDiceCombinations8() {
        assertEquals(125, DiceCombinations.diceCombinations(8));
    }

    @Test
    public void testDiceCombinations9() {
        assertEquals(248, DiceCombinations.diceCombinations(9));
    }

    @Test
    public void testDiceCombinations10() {
        assertEquals(492, DiceCombinations.diceCombinations(10));
    }

    @Test
    public void testDiceCombinations50() {
        assertEquals(660641036, DiceCombinations.diceCombinations(50));
    }

    @Test
    public void testDiceCombinations1000() {
        assertEquals(937196411, DiceCombinations.diceCombinations(1000));
    }

    @Test
    public void testDiceCombinations123456() {
        assertEquals(113810539, DiceCombinations.diceCombinations(123456));
    }

    @Test
    public void testDiceCombinations654321() {
        assertEquals(615247550, DiceCombinations.diceCombinations(654321));
    }

    @Test
    public void testDiceCombinations999998() {
        assertEquals(39372206, DiceCombinations.diceCombinations(999998));
    }

    @Test
    public void testDiceCombinations999999() {
        assertEquals(511319454, DiceCombinations.diceCombinations(999999));
    }

    @Test
    public void testDiceCombinations1000000() {
        assertEquals(874273980, DiceCombinations.diceCombinations(1000000));
    }

    @Test
    public void testDiceCombinations1001() {
        assertEquals(94201505, DiceCombinations.diceCombinations(1001));
    }

    @Test
    public void testDiceCombinations999997() {
        assertEquals(74225807, DiceCombinations.diceCombinations(999997));
    }

    @Test
    public void testDiceCombinations40() {
        assertEquals(567401756, DiceCombinations.diceCombinations(40));
    }
}