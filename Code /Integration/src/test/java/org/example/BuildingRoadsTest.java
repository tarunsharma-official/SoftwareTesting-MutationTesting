package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class BuildingRoadsTest {
    @Test
    public void test1() {
        BuildingRoads graph = new BuildingRoads(10);
        graph.addEdge(2, 5);
        graph.addEdge(5, 6);
        graph.addEdge(1, 4);
        graph.addEdge(6, 8);
        graph.addEdge(2, 6);
        graph.addEdge(3, 6);
        graph.addEdge(1, 10);
        graph.addEdge(8, 9);
        graph.addEdge(2, 3);
        graph.addEdge(5, 8);

        int actualCount = graph.findConnectedComponents();
        List<int[]> actualConnections = graph.getComponentConnections();

        assertEquals(2, actualCount, "Number of additional roads required should match");
        List<int[]> expectedConnections = Arrays.asList(
                new int[]{1, 2},
                new int[]{2, 7}
        );

        assertEquals(expectedConnections.size(), actualConnections.size(), "Number of connections should match");
        for (int i = 0; i < expectedConnections.size(); i++) {
            assertArrayEquals(expectedConnections.get(i), actualConnections.get(i), "Connections should match");
        }
    }
    @Test
    public void test2() {
        BuildingRoads graph = new BuildingRoads(10);
        graph.addEdge(3, 9);
        graph.addEdge(6, 8);
        graph.addEdge(9, 10);
        graph.addEdge(7, 8);
        graph.addEdge(8, 10);
        graph.addEdge(7, 10);
        graph.addEdge(1, 9);
        graph.addEdge(8, 9);
        graph.addEdge(6, 9);
        graph.addEdge(2, 7);

        int actualCount = graph.findConnectedComponents();
        List<int[]> actualConnections = graph.getComponentConnections();

        assertEquals(2, actualCount, "Number of additional roads required should match");
        List<int[]> expectedConnections = Arrays.asList(
                new int[]{1, 4},
                new int[]{4, 5}
        );

        assertEquals(expectedConnections.size(), actualConnections.size(), "Number of connections should match");
        for (int i = 0; i < expectedConnections.size(); i++) {
            assertArrayEquals(expectedConnections.get(i), actualConnections.get(i), "Connections should match");
        }
    }
    @Test
    public void test3() {
        BuildingRoads graph = new BuildingRoads(10);
        graph.addEdge(7, 9);
        graph.addEdge(1, 7);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 6);
        graph.addEdge(2, 9);
        graph.addEdge(9, 10);
        graph.addEdge(3, 8);
        graph.addEdge(3, 9);
        graph.addEdge(5, 10);

        int actualCount = graph.findConnectedComponents();
        List<int[]> actualConnections = graph.getComponentConnections();

        assertEquals(0, actualCount, "Number of additional roads required should match");
        List<int[]> expectedConnections = Arrays.asList(
        );

        assertEquals(expectedConnections.size(), actualConnections.size(), "Number of connections should match");
        for (int i = 0; i < expectedConnections.size(); i++) {
            assertArrayEquals(expectedConnections.get(i), actualConnections.get(i), "Connections should match");
        }
    }

    @Test
    public void test4() {
        BuildingRoads graph = new BuildingRoads(10);
        graph.addEdge(4, 8);
        graph.addEdge(5, 9);
        graph.addEdge(4, 9);
        graph.addEdge(2, 7);
        graph.addEdge(6, 7);
        graph.addEdge(7, 10);
        graph.addEdge(1, 5);
        graph.addEdge(6, 9);
        graph.addEdge(8, 9);
        graph.addEdge(2, 4);

        int actualCount = graph.findConnectedComponents();
        List<int[]> actualConnections = graph.getComponentConnections();

        assertEquals(1, actualCount, "Number of additional roads required should match");
        List<int[]> expectedConnections = Arrays.asList(
                new int[]{1, 3}
        );
    }
    @Test
    public void test5() {
        BuildingRoads graph = new BuildingRoads(10);
        graph.addEdge(4, 9);
        graph.addEdge(2, 4);
        graph.addEdge(7, 10);
        graph.addEdge(1, 8);
        graph.addEdge(1, 5);
        graph.addEdge(3, 4);
        graph.addEdge(9, 10);
        graph.addEdge(7, 8);
        graph.addEdge(8, 9);
        graph.addEdge(6, 7);

        int actualCount = graph.findConnectedComponents();
        List<int[]> actualConnections = graph.getComponentConnections();

        assertEquals(0, actualCount, "Number of additional roads required should match");
        List<int[]> expectedConnections = Arrays.asList(
        );

        assertEquals(expectedConnections.size(), actualConnections.size(), "Number of connections should match");
        for (int i = 0; i < expectedConnections.size(); i++) {
            assertArrayEquals(expectedConnections.get(i), actualConnections.get(i), "Connections should match");
        }
    }
}
