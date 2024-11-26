package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GridPathsTest {
    @Test
    public void testCase1() {
        int n = 10;
        List<List<Character>> a = Arrays.asList(
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.')
        );
        List<List<Long>> dp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Long> row = new ArrayList<>(Collections.nCopies(n, -1L));
            dp.add(row);
        }

        long expectedOutput = 48620
                ;
        long actualOutput = GridPaths.solve(0, 0, a, n, dp);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testCase2() {
        int n = 10;
        List<List<Character>> a = Arrays.asList(
            Arrays.asList('.', '*', '.', '.', '.', '.', '.', '.', '*', '.'),
            Arrays.asList('.', '.', '.', '*', '.', '.', '.', '*', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '*', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '*', '.', '*', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '*', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '*', '.', '.', '*', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '*', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '*', '.', '.', '*', '.', '.'),
            Arrays.asList('*', '.', '.', '.', '.', '.', '.', '.', '.', '*'),
            Arrays.asList('.', '.', '.', '.', '*', '.', '.', '.', '.', '.')

        );
        List<List<Long>> dp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Long> row = new ArrayList<>(Collections.nCopies(n, -1L));
            dp.add(row);
        }

        long expectedOutput = 344
                ;
        long actualOutput = GridPaths.solve(0, 0, a, n, dp);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testCase3() {
        int n = 10;
        List<List<Character>> a = Arrays.asList(
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '*'),
            Arrays.asList('.', '.', '*', '*', '.', '.', '.', '*', '*', '*'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '*', '.', '.', '.', '.', '.', '*', '.', '*'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '*', '.', '.', '.', '.', '.', '.', '.', '*'),
            Arrays.asList('.', '.', '*', '*', '*', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '*', '.', '.', '*', '.', '.'),
            Arrays.asList('.', '.', '.', '*', '*', '.', '.', '.', '.', '.'),
            Arrays.asList('.', '.', '.', '.', '.', '.', '.', '.', '.', '.')
        );
        List<List<Long>> dp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Long> row = new ArrayList<>(Collections.nCopies(n, -1L));
            dp.add(row);
        }

        long expectedOutput = 4063
                ;
        long actualOutput = GridPaths.solve(0, 0, a, n, dp);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testCase4() {
        int n = 10;
        List<List<Character>> a = Arrays.asList(
            Arrays.asList('*', '.', '*', '*', '.', '.', '.', '.', '*', '.'),
            Arrays.asList('*', '.', '.', '.', '.', '.', '.', '*', '*', '.'),
            Arrays.asList('.', '.', '.', '*', '.', '.', '*', '.', '.', '.'),
            Arrays.asList('*', '*', '*', '.', '*', '.', '.', '*', '.', '.'),
            Arrays.asList('*', '*', '*', '.', '*', '*', '*', '*', '*', '*'),
            Arrays.asList('*', '*', '*', '.', '.', '*', '*', '.', '*', '.'),
            Arrays.asList('*', '*', '.', '.', '.', '.', '.', '.', '.', '.'),
            Arrays.asList('*', '.', '*', '.', '.', '.', '*', '*', '*', '.'),
            Arrays.asList('.', '*', '*', '.', '.', '.', '*', '.', '.', '.'),
            Arrays.asList('*', '*', '.', '.', '.', '*', '*', '.', '.', '*')
        );
        List<List<Long>> dp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Long> row = new ArrayList<>(Collections.nCopies(n, -1L));
            dp.add(row);
        }

        long expectedOutput = 0
                ;
        long actualOutput = GridPaths.solve(0, 0, a, n, dp);
        assertEquals(expectedOutput, actualOutput);
    }
}
