package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BuildingTeamsTest {
    @Test
    public void test1() {
        BuildingTeams buildingTeams = new BuildingTeams();
        int n = 10, m = 20;
        List<int[]> edges = Arrays.asList(
                new int[]{3, 4},
                new int[]{8, 10},
                new int[]{3, 7},
                new int[]{1, 8},
                new int[]{2, 8},
                new int[]{9, 10},
                new int[]{2, 4},
                new int[]{6, 9},
                new int[]{1, 4},
                new int[]{3, 5},
                new int[]{1, 9},
                new int[]{6, 7},
                new int[]{2, 9},
                new int[]{2, 7},
                new int[]{1, 7},
                new int[]{4, 10},
                new int[]{5, 6},
                new int[]{4, 6},
                new int[]{3, 8},
                new int[]{7, 10}
        );

        String result = buildingTeams.assignTeams(n, m, edges);
        assertEquals("1 1 1 2 2 1 2 2 2 1", result, "The result should match the expected output");
    }
    @Test
    public void test2() {
        BuildingTeams buildingTeams = new BuildingTeams();
        int n = 10, m = 20;
        List<int[]> edges = Arrays.asList(
                new int[]{1, 3},
                new int[]{8, 10},
                new int[]{2, 4},
                new int[]{6, 8},
                new int[]{7, 8},
                new int[]{2, 8},
                new int[]{1, 8},
                new int[]{8, 9},
                new int[]{5, 8},
                new int[]{4, 9},
                new int[]{4, 5},
                new int[]{4, 10},
                new int[]{3, 9},
                new int[]{1, 4},
                new int[]{4, 7},
                new int[]{3, 7},
                new int[]{3, 5},
                new int[]{2, 3},
                new int[]{3, 6},
                new int[]{4, 6}
        );

        String result = buildingTeams.assignTeams(n, m, edges);
        assertEquals("1 1 2 2 1 1 1 2 1 1", result, "The result should match the expected output");
    }
    @Test
    public void test3() {
        BuildingTeams buildingTeams = new BuildingTeams();
        int n = 10, m = 20;
        List<int[]> edges = Arrays.asList(
                new int[]{7, 10},
                new int[]{3, 10},
                new int[]{9, 10},
                new int[]{2, 10},
                new int[]{1, 7},
                new int[]{4, 7},
                new int[]{2, 8},
                new int[]{4, 9},
                new int[]{5, 9},
                new int[]{1, 9},
                new int[]{7, 8},
                new int[]{2, 6},
                new int[]{8, 9},
                new int[]{5, 7},
                new int[]{3, 4},
                new int[]{2, 5},
                new int[]{6, 9},
                new int[]{3, 5},
                new int[]{3, 6},
                new int[]{6, 7}
        );

        String result = buildingTeams.assignTeams(n, m, edges);
        assertEquals("1 2 2 1 1 1 2 1 2 1", result, "The result should match the expected output");
    }
    @Test
    public void test4() {
        BuildingTeams buildingTeams = new BuildingTeams();
        int n = 10, m = 20;
        List<int[]> edges = Arrays.asList(
                new int[]{2, 4},
                new int[]{2, 10},
                new int[]{7, 10},
                new int[]{4, 6},
                new int[]{1, 9},
                new int[]{4, 7},
                new int[]{1, 6},
                new int[]{9, 10},
                new int[]{2, 3},
                new int[]{1, 5},
                new int[]{8, 9},
                new int[]{7, 8},
                new int[]{1, 2},
                new int[]{3, 9},
                new int[]{6, 10},
                new int[]{2, 8},
                new int[]{4, 9},
                new int[]{6, 8},
                new int[]{3, 5},
                new int[]{4, 5}
        );

        String result = buildingTeams.assignTeams(n, m, edges);
        assertEquals("1 2 1 1 2 2 2 1 2 1", result, "The result should match the expected output");
    }
    @Test
    public void test5() {
        BuildingTeams buildingTeams = new BuildingTeams();
        int n = 10, m = 20;
        List<int[]> edges = Arrays.asList(
                new int[]{3, 5},
                new int[]{8, 10},
                new int[]{9, 10},
                new int[]{1, 8},
                new int[]{1, 4},
                new int[]{7, 10},
                new int[]{4, 6},
                new int[]{5, 8},
                new int[]{4, 5},
                new int[]{5, 7},
                new int[]{2, 7},
                new int[]{1, 9},
                new int[]{6, 9},
                new int[]{1, 7},
                new int[]{3, 8},
                new int[]{5, 9},
                new int[]{6, 7},
                new int[]{2, 4},
                new int[]{2, 5},
                new int[]{6, 10}
        );

        String result = buildingTeams.assignTeams(n, m, edges);
        assertEquals("IMPOSSIBLE", result, "The result should match the expected output");
    }
    @Test
    public void test6() {
        BuildingTeams buildingTeams = new BuildingTeams();
        int n = 5, m = 4;
        List<int[]> edges = Arrays.asList(
                new int[]{1, 2},
                new int[]{3, 4},
                new int[]{4, 5},
                new int[]{5, 3}
        );

        String result = buildingTeams.assignTeams(n, m, edges);
        assertEquals("IMPOSSIBLE", result, "The result should match the expected output");
    }
    @Test
    public void test7() {
        BuildingTeams buildingTeams = new BuildingTeams();
        int n = 4, m = 5;
        List<int[]> edges = Arrays.asList(
                new int[]{1, 2},
                new int[]{1, 4},
                new int[]{2, 3},
                new int[]{2, 4},
                new int[]{3, 4}
        );

        String result = buildingTeams.assignTeams(n, m, edges);
        assertEquals("IMPOSSIBLE", result, "The result should match the expected output");
    }


}
