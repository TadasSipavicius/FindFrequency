// Tadas Sipavičius
package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    @Test
    void getMinValue() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(7);
        Collections.sort(arrayList);
        int minValue = Calculations.getMinValue(arrayList);
        int expectedResult = 1;
        assertEquals(expectedResult,minValue);
    }

    @Test
    void getMaxValue() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(7);
        Collections.sort(arrayList);
        int maxValue = Calculations.getMaxValue(arrayList);
        int expectedResult = 8;
        assertEquals(expectedResult,maxValue);
    }

    @Test
    void addAllNumbersBetweenMinAndMax() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(7);
        Collections.sort(arrayList);
        int min = Calculations.getMinValue(arrayList);
        int max = Calculations.getMaxValue(arrayList);
        Calculations.addAllNumbersBetweenMinAndMax(arrayList,numbers);
        int expectedResult = 8;
        assertEquals(expectedResult, numbers.size());
    }

}