package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class RoundTripTest {
    @Test
    public void test1() {
        RoundTrip roundTrip = new RoundTrip();
        int n = 10, m = 20;
        List<int[]> edges = Arrays.asList(
                new int[]{8, 5},
                new int[]{6, 10},
                new int[]{3, 6},
                new int[]{3, 1},
                new int[]{8, 6},
                new int[]{9, 10},
                new int[]{2, 1},
                new int[]{6, 7},
                new int[]{4, 3},
                new int[]{1, 9},
                new int[]{3, 7},
                new int[]{2, 6},
                new int[]{4, 1},
                new int[]{2, 5},
                new int[]{8, 4},
                new int[]{1, 8},
                new int[]{10, 8},
                new int[]{5, 4},
                new int[]{7, 1},
                new int[]{7, 9}
        );

        String result = roundTrip.determineBipartite(n, m, edges);
        assertEquals("IMPOSSIBLE", result, "The result should match the expected output");
    }
    @Test
    public void test2() {
        RoundTrip roundTrip = new RoundTrip();
        int n = 10, m = 20;
        List<int[]> edges = Arrays.asList(
                new int[]{9, 8},
                new int[]{9, 5},
                new int[]{6, 4},
                new int[]{5, 10},
                new int[]{7, 5},
                new int[]{7, 8},
                new int[]{3, 4},
                new int[]{6, 5},
                new int[]{2, 1},
                new int[]{10, 4},
                new int[]{6, 1},
                new int[]{9, 7},
                new int[]{7, 3},
                new int[]{4, 5},
                new int[]{2, 9},
                new int[]{5, 3},
                new int[]{2, 3},
                new int[]{8, 5},
                new int[]{6, 7},
                new int[]{3, 8}
        );

        String result = roundTrip.determineBipartite(n, m, edges);
        assertEquals("IMPOSSIBLE", result, "The result should match the expected output");
    }
    @Test
    public void test3() {
        RoundTrip roundTrip = new RoundTrip();
        int n = 5, m = 5;
        List<int[]> edges = Arrays.asList(
                new int[]{1, 2},
                new int[]{1, 3},
                new int[]{2, 4},
                new int[]{4, 3},
                new int[]{1, 5}
        );

        String result = roundTrip.determineBipartite(n, m, edges);
        assertEquals("1 2 2 1 2", result, "The result should match the expected output");
    }
}
