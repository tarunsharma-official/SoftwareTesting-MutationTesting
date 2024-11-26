package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class StaticRangeSumQueriesTest {
    @Test
    public void test1() {
        long[] array = {
                7, 6, 4, 6, 2, 9, 4, 8};
        StaticRangeSumQueries staticRangeSumQueries = new StaticRangeSumQueries(array);

        assertEquals(7, staticRangeSumQueries.query(0, 0), "Query 1 failed");
        assertEquals(13, staticRangeSumQueries.query(0, 1), "Query 2 failed");
        assertEquals(17, staticRangeSumQueries.query(0, 2), "Query 3 failed");
        assertEquals(23, staticRangeSumQueries.query(0, 3), "Query 4 failed");
        assertEquals(25, staticRangeSumQueries.query(0, 4), "Query 5 failed");
        assertEquals(34, staticRangeSumQueries.query(0, 5), "Query 6 failed");
        assertEquals(38, staticRangeSumQueries.query(0, 6), "Query 7 failed");
        assertEquals(46, staticRangeSumQueries.query(0, 7), "Query 8 failed");
        assertEquals(6, staticRangeSumQueries.query(1, 1), "Query 9 failed");
        assertEquals(10, staticRangeSumQueries.query(1, 2), "Query 10 failed");
        assertEquals(16, staticRangeSumQueries.query(1, 3), "Query 11 failed");
        assertEquals(18, staticRangeSumQueries.query(1, 4), "Query 12 failed");
        assertEquals(27, staticRangeSumQueries.query(1, 5), "Query 13 failed");
        assertEquals(31, staticRangeSumQueries.query(1, 6), "Query 14 failed");
        assertEquals(39, staticRangeSumQueries.query(1, 7), "Query 15 failed");
        assertEquals(4, staticRangeSumQueries.query(2, 2), "Query 16 failed");
        assertEquals(10, staticRangeSumQueries.query(2, 3), "Query 17 failed");
        assertEquals(12, staticRangeSumQueries.query(2, 4), "Query 18 failed");
        assertEquals(21, staticRangeSumQueries.query(2, 5), "Query 19 failed");
        assertEquals(25, staticRangeSumQueries.query(2, 6), "Query 20 failed");
        assertEquals(33, staticRangeSumQueries.query(2, 7), "Query 21 failed");
        assertEquals(6, staticRangeSumQueries.query(3, 3), "Query 22 failed");
        assertEquals(8, staticRangeSumQueries.query(3, 4), "Query 23 failed");
        assertEquals(17, staticRangeSumQueries.query(3, 5), "Query 24 failed");
        assertEquals(21, staticRangeSumQueries.query(3, 6), "Query 25 failed");
        assertEquals(29, staticRangeSumQueries.query(3, 7), "Query 26 failed");
        assertEquals(2, staticRangeSumQueries.query(4, 4), "Query 27 failed");
        assertEquals(11, staticRangeSumQueries.query(4, 5), "Query 28 failed");
        assertEquals(15, staticRangeSumQueries.query(4, 6), "Query 29 failed");
        assertEquals(23, staticRangeSumQueries.query(4, 7), "Query 30 failed");
        assertEquals(9, staticRangeSumQueries.query(5, 5), "Query 31 failed");
        assertEquals(13, staticRangeSumQueries.query(5, 6), "Query 32 failed");
        assertEquals(21, staticRangeSumQueries.query(5, 7), "Query 33 failed");
        assertEquals(4, staticRangeSumQueries.query(6, 6), "Query 34 failed");
        assertEquals(12, staticRangeSumQueries.query(6, 7), "Query 35 failed");
        assertEquals(8, staticRangeSumQueries.query(7, 7), "Query 36 failed");
    }
}
