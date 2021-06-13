package com.afaqy.example1;

public class Calculator <T>  {

    public <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public <T extends Number> double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public <T extends Number> double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }

}
