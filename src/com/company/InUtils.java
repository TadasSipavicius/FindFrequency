// Tadas Sipavičius
package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InUtils {

    /**
     * Reading data from file
     * Delimiter is - ','
     * @param givenList         List, where data will be stored
     * @throws IOException      If the file is not found, or file is corrupted
     */
    public static void readingFromFile(ArrayList<Integer> givenList) throws IOException{
        Scanner scannerFile = new Scanner(new File("src/data.txt"));
        scannerFile.useDelimiter(",");
        while(scannerFile.hasNext()){
            givenList.add(scannerFile.nextInt());
        }
        scannerFile.close();
    }

    /**
     * Data can be added through terminal
     * Need to specify size of the list
     * Write down all integers
     * @param givenList         List, where data will be stored
     */
    public static void addIntegersThroughTerminal(ArrayList<Integer> givenList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number how many numbers you want to have in the list:");
        int list_length = scanner.nextInt();
        System.out.println("Enter all numbers, which you want to have in the list:");
        while(list_length != 0){
            givenList.add(scanner.nextInt());
            list_length--;
        }
    }
}
