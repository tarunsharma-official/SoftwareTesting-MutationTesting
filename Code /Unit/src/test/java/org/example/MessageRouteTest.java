package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageRouteTest {
    @Test
    public void test1() {
        MessageRoute messageRoute = new MessageRoute();
        int n = 10, m = 8;
        List<int[]> edges = Arrays.asList(
                new int[]{3, 4},
                new int[]{7, 8},
                new int[]{5, 4},
                new int[]{6, 7},
                new int[]{9, 8},
                new int[]{5, 6},
                new int[]{3, 2},
                new int[]{1, 2}
        );

        String result = messageRoute.findMessageRoute(n, m, edges);
        assertEquals("IMPOSSIBLE", result, "The result should be IMPOSSIBLE");
    }
    @Test
    public void test2() {
        MessageRoute messageRoute = new MessageRoute();
        int n = 4, m = 2;
        List<int[]> edges = Arrays.asList(
                new int[]{1, 2},
                new int[]{3, 4}
        );

        String result = messageRoute.findMessageRoute(n, m, edges);
        String expectedOutput = "IMPOSSIBLE";

        assertEquals(expectedOutput, result, "The result should indicate that the route is impossible");
    }
    @Test
    public void test3() {
        MessageRoute messageRoute = new MessageRoute();
        int n = 5, m = 3;
        List<int[]> edges = Arrays.asList(
                new int[]{1, 2},
                new int[]{3, 4},
                new int[]{4, 5}
        );

        String result = messageRoute.findMessageRoute(n, m, edges);
        String expectedOutput = "IMPOSSIBLE";

        assertEquals(expectedOutput, result, "The result should indicate that the route is impossible");
    }

}
