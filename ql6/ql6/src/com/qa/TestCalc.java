package com.qa;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc bc = new BadCalc();
        System.out.println("Mul: " + bc.mul(2, 3));
        try {
            System.out.println("Div: " + bc.div(6, 0));
        } catch (ArithmeticException ae) {
            System.out.println("error calculation");
        }

    }
}
