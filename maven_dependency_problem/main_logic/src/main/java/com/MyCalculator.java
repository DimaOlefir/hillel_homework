package com;

import org.apache.commons.lang.math.NumberUtils;

import java.util.Objects;

public class MyCalculator {
    private int number1;
    private int number2;


    public MyCalculator(String numberFirstAsString, String numberSecondAsString) {
        if (NumberUtils.isNumber(numberFirstAsString) && NumberUtils.isNumber(numberSecondAsString)) {
            this.number1 = Integer.parseInt(numberFirstAsString);
            this.number2 = Integer.parseInt(numberSecondAsString);
        }
    }

    public int sum() {
        return number1 + number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCalculator that = (MyCalculator) o;
        return number1 == that.number1 &&
                number2 == that.number2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1, number2);
    }


    @Override
    public String toString() {
        return "MyCalculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
