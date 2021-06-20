// Tadas Sipavičius
package com.company;

import java.util.ArrayList;


public class PrintMethods {

    /**
     * Printing number list
     * @param numbers       List, where all numbers from minValue to maxValue are stored
     */
    public static void printNumbers(ArrayList<Integer> numbers){
        System.out.println();
        System.out.printf("%-10s","Number:");
        for (Integer number : numbers) {
            System.out.printf("%4s", number );
        }
        System.out.println();
    }

    /**
     * Printing frequency list
     * @param frequency         List, where frequency numbers are stored
     */
    public static void printFrequency(ArrayList<Integer> frequency){
        System.out.print("Frequency:");
        for (Integer integer : frequency) {
            System.out.printf("%4s", integer);
        }
    }

    /**
     * Printing number list below graph(without "Number:" word)
     * @param numbers       List, where all numbers from minValue to maxValue are stored
     */
    public static void printNumbersBelowGraph(ArrayList<Integer> numbers){
        for (Integer number : numbers) {
            System.out.printf("%4s",number);
        }
    }

    /**
     * A printing function, where instead of displaying a number the graph is displayed
     * @param frequency     List, where frequency numbers are stored
     */
    public static void printSymbolList(ArrayList<Integer> frequency){
        System.out.println();
        int maxValue = Calculations.findMax(frequency);
        while(maxValue != 0){
            for(int i = 0; i < frequency.size(); i++){
                if(frequency.get(i).equals(maxValue)){
                    System.out.printf("%4s","*");
                    frequency.set(i, frequency.get(i) - 1);
                }
                else{
                    System.out.printf("%4s","");
                }
            }
            System.out.println();
            maxValue--;
        }
    }
}
