package com.epam.conditions;

public class CoordinatePane {

    public String printQuadrant(int x, int y) {
        if (x > 0 && y>0){
            return "first";
        } else if (x < 0 && y>0){
            return "second";
        } else if (x < 0 && y<0){
            return "third";
        } else if (x > 0 && y<0){
            return "fourth";
        }
        return "zero";
    }

}

