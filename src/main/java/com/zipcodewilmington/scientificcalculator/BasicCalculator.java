package com.zipcodewilmington.scientificcalculator;

public class BasicCalculator {

    public static int addition(int workingValue, int userInput){ //sum two integers
        return workingValue + userInput;
    }
    public static int subtraction(int a, int b){ //difference of two numbers
        return a - b;
    }
    public static int multiplication(int a, int b){ //product of two numbers
        return a * b;
    }

    public static int division(int a, int b){ //quotient of two numbers
        return a / b;
    }

    public static int square(int a){ //square of a number

        return a * a;
    }

    public static int squareRoot(int a){ //square root of a number

        return (int) Math.pow(a, 0.5);
    }
    public static int exponentiation(int a, int b){ //exponentiate a number

        return (int) Math.pow(a, b);
    }

    public static int inversion(int a){ //calculate inverse of a number
        return 1 / a;
    }
    public static int invert(int a){ //invert number
        return a *= -1;

    }





}
