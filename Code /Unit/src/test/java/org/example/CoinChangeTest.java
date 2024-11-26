package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTest {

    @Test
    public void testCase1() {
        int n = 1;
        int k = 1;
        List<Integer> arr = List.of(1);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 1;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void testCase2() {
        int n = 3;
        int k = 2000;
        List<Integer> arr = Arrays.asList(1, 1500, 1000);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 2;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }



    @Test
    public void testCase3() {
        int n = 100;
        int k = 1000000;
        List<Integer> arr = Arrays.asList(649304, 85832, 159093, 841262, 930486, 225095, 306941, 914339, 469211, 156923, 460959, 236712, 440066, 842678, 379057, 615269, 321673, 694036, 378785, 792217, 78290, 15844, 644234, 752342, 102458, 30237, 191522, 388758, 697655, 113684, 20857, 639493, 641307, 527161, 977787, 505822, 196847, 735190, 169901, 417528, 342499, 102964, 907594, 780802, 577476, 162325, 790726, 579970, 148134, 144070, 624899, 392951, 594195, 813112, 534969, 856431, 25058, 630213, 641105, 636550, 762730, 873997, 275210, 717753, 243026, 915205, 52253, 613173, 751823, 647785, 928932, 305278, 858885, 496267, 717378, 426281, 245531, 139541, 942976, 912031, 550043, 194533, 504278, 552822, 805186, 950257, 673230, 484067, 790808, 762595, 590958, 799224, 711398, 599947, 858840, 212470, 820350, 710862, 546121, 159727);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 4;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }



    @Test
    public void testCase4() {
        int n = 100;
        int k = 1000;
        List<Integer> arr = Arrays.asList(389, 101, 552, 795, 876, 269, 887, 103, 154, 689, 542, 920, 128, 541, 44, 657, 310, 531, 656, 567, 386, 536, 900, 374, 929, 505, 255, 376, 384, 709, 311, 404, 699, 86, 512, 518, 321, 916, 408, 935, 568, 662, 731, 933, 238, 331, 833, 235, 423, 352, 205, 669, 413, 152, 695, 713, 878, 614, 109, 164, 387, 3, 287, 823, 485, 716, 556, 323, 924, 57, 35, 705, 643, 77, 200, 944, 768, 490, 589, 339, 701, 190, 714, 349, 252, 303, 74, 526, 186, 644, 453, 251, 429, 170, 777, 216, 22, 825, 514, 379);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 2;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCase5() {
        int n = 100;
        int k = 1000000;
        List<Integer> arr = Arrays.asList(999, 541, 97, 522, 78, 380, 993, 971, 517, 507, 127, 372, 612, 548, 232, 988, 942, 335, 311, 884, 788, 641, 626, 663, 941, 859, 526, 412, 430, 18, 879, 133, 11, 563, 841, 833, 258, 633, 379, 281, 560, 852, 268, 659, 586, 36, 629, 183, 640, 861, 257, 51, 265, 872, 105, 272, 486, 982, 978, 286, 277, 722, 757, 308, 16, 869, 203, 998, 205, 33, 77, 680, 621, 676, 132, 141, 68, 170, 965, 298, 185, 539, 150, 276, 798, 458, 409, 536, 894, 744, 569, 333, 865, 242, 142, 911, 875, 287, 433, 950);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 1002;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCase6() {
        int n = 100;
        int k = 123456;
        List<Integer> arr = Arrays.asList(999, 541, 97, 522, 78, 380, 993, 971, 517, 507, 127, 372, 612, 548, 232, 988, 942, 335, 311, 884, 788, 641, 626, 663, 941, 859, 526, 412, 430, 18, 879, 133, 11, 563, 841, 833, 258, 633, 379, 281, 560, 852, 268, 659, 586, 36, 629, 183, 640, 861, 257, 51, 265, 872, 105, 272, 486, 982, 978, 286, 277, 722, 757, 308, 16, 869, 203, 998, 205, 33, 77, 680, 621, 676, 132, 141, 68, 170, 965, 298, 185, 539, 150, 276, 798, 458, 409, 536, 894, 744, 569, 333, 865, 242, 142, 911, 875, 287, 433, 950);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 124;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }



    @Test
    public void testCase7() {
        int n = 2;
        int k = 1;
        List<Integer> arr = Arrays.asList(1, 10);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 1;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCase8() {
        int n = 10;
        int k = 200;
        List<Integer> arr = Arrays.asList(2, 3, 4, 8, 9, 11, 14, 16, 17, 19);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 11;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCase9() {
        int n = 10;
        int k = 1000000;
        List<Integer> arr = Arrays.asList(2390, 24239, 49476, 189008, 194217, 270814, 448939, 503669, 699752, 715805);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 111;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCase10() {
        int n = 3;
        int k = 11;
        List<Integer> arr = Arrays.asList(1, 2, 5);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 3;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCase11() {
        int n = 4;
        int k = 37;
        List<Integer> arr = Arrays.asList(2, 3, 28, 33);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 3;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCase12() {
        int n = 4;
        int k = 32;
        List<Integer> arr = Arrays.asList(3, 6, 10, 15);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 4;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCase13() {
        int n = 8;
        int k = 17;
        List<Integer> arr = Arrays.asList(5, 10, 11, 12, 13, 14, 15, 16);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);

        int expectedOutput = 2;
        int actualOutput = CoinChange.solve(n, k, arr, dp);
        assertEquals(expectedOutput, actualOutput);
    }

}
