package com.ysoft.training;

// Generate Checkstyle warning - unused import
import java.util.Date;

// Circular dependency for JDepend
import com.ysoft.circle.Circulator;

public class Calculator {

    /** Internal counter */
    private int counter;

    public Calculator() {
        counter = 0;
    }


    public int getCounter() {
        return counter;
    }

    public int getCirculator() {
        Circulator circ = new Circulator();
        return circ.compute();
    }

    public void add(int i) {

        // Generate PMD warning
        if (i==1) {
        }

        counter += i;
    }
}

