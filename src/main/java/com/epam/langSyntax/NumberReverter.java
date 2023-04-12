package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int a = number % 10;
        number /= 10;
        int b = number % 10;
        number /= 10;
        int c = number % 10;
        System.out.println(a * 100 + b * 10 + c);
    }

}
