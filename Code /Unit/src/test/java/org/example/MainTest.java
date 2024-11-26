package org.example;
import org.junit.jupiter.api.Test;
public class MainTest {
    @Test
    public void testDiceCombinations() {
        DiceCombinationsTest test = new DiceCombinationsTest();
        test.testDiceCombinations1();
        test.testDiceCombinations2();
        test.testDiceCombinations3();
        test.testDiceCombinations4();
        test.testDiceCombinations5();
        test.testDiceCombinations6();
        test.testDiceCombinations7();
        test.testDiceCombinations8();
        test.testDiceCombinations9();
        test.testDiceCombinations10();
        test.testDiceCombinations50();
        test.testDiceCombinations1000();
        test.testDiceCombinations123456();
        test.testDiceCombinations654321();
        test.testDiceCombinations999998();
        test.testDiceCombinations999999();
        test.testDiceCombinations1000000();
        test.testDiceCombinations1001();
        test.testDiceCombinations999997();
        test.testDiceCombinations40();
    }
    @Test
    public void testCoinChange() {
        CoinChangeTest test = new CoinChangeTest();
        test.testCase1();
        test.testCase2();
        test.testCase3();
        test.testCase4();
        test.testCase5();
        test.testCase6();
        test.testCase7();
        test.testCase8();
        test.testCase9();
        test.testCase10();
        test.testCase11();
        test.testCase12();
        test.testCase13();

    }
    @Test
    public void testGridPaths(){
        GridPathsTest test = new GridPathsTest();
        test.testCase1();
        test.testCase2();
        test.testCase3();
        test.testCase4();

    }
    @Test
    public void testMessageRoute(){
        MessageRouteTest test = new MessageRouteTest();
        test.test1();
        test.test2();
        test.test3();
    }
    @Test
    public void testRoundTrip(){
        RoundTripTest test = new RoundTripTest();
        test.test1();
        test.test2();
        test.test3();
    }
    @Test
    public void testBuildingTeams(){
        BuildingTeamsTest test = new BuildingTeamsTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
    }
}
