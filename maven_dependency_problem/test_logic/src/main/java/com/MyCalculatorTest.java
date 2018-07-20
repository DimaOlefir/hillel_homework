package com;

public class MyCalculatorTest {
    public static void main(String[] args) {
        int expectedResult = 25;
        int actualResult = new com.MyCalculator("12", "13").sum();

        assert expectedResult == actualResult : "bug";
    }
}
