package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GridComponentsTest {

    @Test
    public void testSingleComponent() {
        List<List<Character>> grid = Arrays.asList(
                Arrays.asList('.', '.', '.', '.'),
                Arrays.asList('.', '#', '#', '.'),
                Arrays.asList('.', '#', '#', '.'),
                Arrays.asList('.', '.', '.', '.')
        );
        int result = GridComponents.countComponents(4, 4, grid);
        assertEquals(1, result);
    }

    @Test
    public void testMultipleComponents() {
        List<List<Character>> grid = Arrays.asList(
                Arrays.asList('#', '#', '.', '.'),
                Arrays.asList('#', '#', '.', '.'),
                Arrays.asList('.', '.', '#', '#'),
                Arrays.asList('.', '.', '#', '#')
        );
        int result = GridComponents.countComponents(4, 4, grid);
        assertEquals(2, result);
    }

    @Test
    public void testNoComponents() {
        List<List<Character>> grid = Arrays.asList(
                Arrays.asList('#', '#', '#'),
                Arrays.asList('#', '#', '#'),
                Arrays.asList('#', '#', '#')
        );
        int result = GridComponents.countComponents(3, 3, grid);
        assertEquals(0, result);
    }


    @Test
    public void testEntireGridIsComponent() {
        List<List<Character>> grid = Arrays.asList(
                Arrays.asList('.', '.', '.'),
                Arrays.asList('.', '.', '.'),
                Arrays.asList('.', '.', '.')
        );
        int result = GridComponents.countComponents(3, 3, grid);
        assertEquals(1, result);
    }

    @Test
    public void testComplexShape() {
        List<List<Character>> grid = Arrays.asList(
                Arrays.asList('#', '#', '#', '#', '#'),
                Arrays.asList('#', '.', '.', '.', '#'),
                Arrays.asList('#', '.', '#', '#', '#'),
                Arrays.asList('#', '.', '.', '.', '#'),
                Arrays.asList('#', '#', '#', '#', '#')
        );
        int result = GridComponents.countComponents(5, 5, grid);
        assertEquals(1, result);
    }

    @Test
    public void testLargeGridWithSparseComponents() {
        List<List<Character>> grid = Arrays.asList(
                Arrays.asList('#', '.', '#', '.', '#', '.'),
                Arrays.asList('.', '#', '.', '#', '.', '#'),
                Arrays.asList('#', '.', '#', '.', '#', '.'),
                Arrays.asList('.', '#', '.', '#', '.', '#'),
                Arrays.asList('#', '.', '#', '.', '#', '.'),
                Arrays.asList('.', '#', '.', '#', '.', '#')
        );
        int result = GridComponents.countComponents(6, 6, grid);
        assertEquals(18, result);
    }


    @Test
    public void testEmptyGrid() {
        List<List<Character>> grid = List.of();
        int result = GridComponents.countComponents(0, 0, grid);
        assertEquals(0, result);
    }
}
