package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int j = 1; j <= 10; j++) {
            System.out.println(j + " x " + numberTableToPrint + " = " + numberTableToPrint * j);
        }
    }

}
