// Tadas Sipavičius
package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static ArrayList<Integer> A = new ArrayList<>();
    public static ArrayList<Integer> Numbers = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        //Data can be added through data.txt file and through terminal
        //It was easier for me to test the results using data.txt instead of terminal

        //Input section:
        InUtils.readingFromFile(A);
        //InUtils.addIntegersThroughTerminal(A);

        //Calculation section:
        Collections.sort(A);
        Calculations.addAllNumbersBetweenMinAndMax(A, Numbers);
        ArrayList<Integer> Frequency = new ArrayList<>(Collections.nCopies(Numbers.size(), 0));
        Calculations.getFrequency(Frequency, Numbers);

        //Printing section:
        PrintMethods.printFrequency(Frequency);
        PrintMethods.printNumbers(Numbers);
        PrintMethods.printSymbolList(Frequency);
        PrintMethods.printNumbersBelowGraph(Numbers);
    }
}
