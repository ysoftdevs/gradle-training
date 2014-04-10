package com.ysoft.circle;

// Create circular dependency for JDepend
import com.ysoft.training.Calculator;

public class Circulator {
    
    public int compute() {
        Calculator calc = new Calculator();
        calc.add(1);
        return calc.getCounter();
    }
}

