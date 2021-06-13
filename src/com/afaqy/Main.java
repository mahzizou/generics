package com.afaqy;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(5, 6));
        System.out.println(calculator.add(10.0, 3.0));

        System.out.println(calculator.subtract(5, 6));
        System.out.println(calculator.subtract(10.0, 3.0));

        System.out.println(calculator.multiply(5, 6));
        System.out.println(calculator.multiply(10.0, 3.0));

        System.out.println(calculator.divide(5, 6));
        System.out.println(calculator.divide(5.0, 6.0));
        System.out.println(calculator.divide(10.0, 3.0));

    }
}
