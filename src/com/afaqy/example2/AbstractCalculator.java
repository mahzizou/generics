package com.afaqy.example2;

public abstract class AbstractCalculator {

    public abstract <N extends Number> N add(N a, N b);

    public abstract <N extends Number> N subtract(N a, N b);

    public abstract <N extends Number> N multiply(N a, N b);

    public abstract <N extends Number> N divide(N a, N b);

}
