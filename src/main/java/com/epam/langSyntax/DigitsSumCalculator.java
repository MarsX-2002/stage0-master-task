package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int a = number % 10;
        number /= 10;
        int b = number % 10;
        number /= 10;
        int c = number % 10;
        number /= 10;
        int d = number % 10;
        int res = a + b + c + d;
        System.out.println(res);
    }

}
