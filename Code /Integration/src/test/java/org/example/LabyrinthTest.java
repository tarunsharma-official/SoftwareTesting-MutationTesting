package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabyrinthTest {

    @Test
    public void test1() {
        char[][] grid = {
                {'#', '#', '.', 'A', '#', '#', '#', '#', '#', '#'},
                {'#', '.', '#', '#', '.', '#', '#', '.', '#', '#'},
                {'#', '#', '#', '#', '#', '.', '.', '#', '#', '#'},
                {'.', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'.', '#', '#', '#', '#', '#', '#', '#', '#', '.'},
                {'#', '#', '#', '.', '#', '#', '#', '.', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '.'},
                {'#', '#', '#', '#', '#', '#', '.', '#', '.', '#'},
                {'#', '#', '#', '.', '.', '#', '#', '#', '.', '#'},
                {'#', '#', '#', '.', 'B', '#', '#', '#', '#', '#'}
        };

        Labyrinth labyrinth = new Labyrinth();
        labyrinth.GridPathFinder(10, 10, grid);

        boolean pathExists = labyrinth.bfs(1, 1); // Starting position of 'A'

        assertEquals(false, pathExists);
    }

    @Test
    public void test2() {
        char[][] grid = {
                {'#', '#', '#', '#'},
                {'#', 'A', '#', '#'},
                {'#', '#', 'B', '#'},
                {'#', '#', '#', '#'}
        };

        Labyrinth labyrinth = new Labyrinth();
        labyrinth.GridPathFinder(3, 3, grid);

        boolean pathExists = labyrinth.bfs(1, 1); // Starting position of 'A'

        assertEquals(false, pathExists, "Path should not exist");
    }

    @Test
    public void test3() {
        char[][] grid = {
                {'#', '#', '#', '#', '#'},
                {'#', 'A', '.', '.', '#'},
                {'#', '.', '#', '.', '#'},
                {'#', '.', '.', 'B', '#'},
                {'#', '#', '#', '#', '#'}
        };

        Labyrinth labyrinth = new Labyrinth();
        labyrinth.GridPathFinder(4, 4, grid);

        boolean pathExists = labyrinth.bfs(1, 1); // Starting position of 'A'

        assertEquals(true, pathExists, "Path should exist");
        // The actual path depends on the BFS order; we are verifying the existence, not the exact path
    }

    @Test
    public void test4() {
        char[][] grid = {
                {'#', '#', '#', '#'},
                {'#', '#', 'A', '#'},
                {'#', '#', '#', '#'},
                {'#', '#', '#', '#'}
        };

        Labyrinth labyrinth = new Labyrinth();
        labyrinth.GridPathFinder(3, 3, grid);

        boolean pathExists = labyrinth.bfs(1, 2); // Starting position of 'A'

        assertEquals(false, pathExists, "Path should not exist as 'A' is blocked");
    }
}
