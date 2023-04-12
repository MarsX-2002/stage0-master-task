package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("Invalid date");
            return;
        }
        if (month < 1 || month > 12) {
            System.out.println("Invalid date");
            return;
        }
        int days = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> {
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
            }
        }
        System.out.println(days);
    }
}

