package com.afaqy.example2;

public class Calculator extends AbstractCalculator {

    @Override
    public <N extends Number> N add(N a, N b) {
        if (a instanceof Integer && a instanceof Integer) {
            return (N) (Integer) ((Integer) a + (Integer) b);
        } else if (a instanceof Double && b instanceof Double){
            return (N) (Double) ((Double)a + (Double)b);
        }
        else
            return null;
    }

    @Override
    public <N extends Number> N subtract(N a, N b) {
        if (a instanceof Integer && a instanceof Integer) {
            return (N) (Integer) ((Integer) a - (Integer) b);
        } else if (a instanceof Double && b instanceof Double){
            return (N) (Double) ((Double)a - (Double)b);
        }
        else
            return null;
    }

    @Override
    public <N extends Number> N multiply(N a, N b) {
        if (a instanceof Integer && a instanceof Integer) {
            return (N) (Integer) ((Integer) a * (Integer) b);
        } else if (a instanceof Double && b instanceof Double){
            return (N) (Double) ((Double)a * (Double)b);
        }
        else
            return null;
    }

    @Override
    public <N extends Number> N divide(N a, N b) {
        if (a instanceof Integer && a instanceof Integer) {
            return (N) (Integer) ((Integer) a / (Integer) b);
        } else if (a instanceof Double && b instanceof Double){
            return (N) (Double) ((Double)a / (Double)b);
        }
        else
            return null;
    }

}
