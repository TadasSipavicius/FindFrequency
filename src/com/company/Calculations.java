// Tadas Sipavičius
package com.company;

import java.util.ArrayList;

public class Calculations{

        /**
         * Gets the minimum value from sorted int list
         *
         * @return      Minimum value of the list
         */
        public static int getMinValue(ArrayList<Integer> givenList){
            return givenList.get(0);
        }


        /**
         * Gets the maximum value from sorted int list
         *
         * @return      Maximum value of the list
         */
        public static int getMaxValue(ArrayList<Integer> givenList){
            return givenList.get(givenList.size() - 1);
        }

        /**
         * Adds all numbers, which are between min and max value
         */
        public static void addAllNumbersBetweenMinAndMax(ArrayList<Integer> givenList, ArrayList<Integer> toAddList){
            for(int i = getMinValue(givenList); i <= getMaxValue(givenList); i++){
                toAddList.add(i);
            }
        }

        /**
         * Finds how many times each integer is repeated in the data list
         * @param frequency     List
         */
        public static void getFrequency(ArrayList<Integer> frequency, ArrayList<Integer> numbers){
            for(int i = 0; i < numbers.size(); i++){
                for (Integer integer : Main.A) {
                    if (numbers.get(i).equals(integer)) {
                        frequency.set(i, frequency.get(i) + 1);
                    }
                }
            }
        }

        /**
         * Finds the maximum value in unsorted int list
         * @param frequency         List
         * @return                  Maximum value of the given list
         */
        public static int findMax(ArrayList<Integer> frequency){
            int max = Integer.MIN_VALUE;
            for (Integer integer : frequency) {
                if (integer > max) {
                    max = integer;
                }
            }
            return max;
        }
}
